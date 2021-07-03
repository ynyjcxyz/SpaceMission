import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

  public ArrayList<Item> loadItems(File file) throws FileNotFoundException {
    Scanner scanner = new Scanner(file);
    ArrayList<Item> loadedItem = new ArrayList<>();
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] split = line.split("=");
      String name = split[0];
      int kgAsInt = Integer.parseInt(split[1]);
      Item item = new Item(name, kgAsInt);
      loadedItem.add(item);
    }
    return loadedItem;
  }

  public ArrayList<Rocket> loadU1(ArrayList<Item> loadedItem){
    ArrayList<Rocket> u1Rockets = new ArrayList<>();
    Rocket newU1 = new U1();
    for(Item item: loadedItem){
      if(newU1.canCarry(item)){
        newU1.carry(item);
      }
      else{
        u1Rockets.add(newU1);
        newU1 = new U1();
      }
    }
    return u1Rockets;
  }

  public ArrayList<Rocket> loadU2(ArrayList<Item> loadedItem){
    ArrayList<Rocket> u2Rockets = new ArrayList<>();
    Rocket newU2 = new U2();
    for(Item item: loadedItem){
      if(newU2.canCarry(item)){
        newU2.carry(item);
      }
      else{
        u2Rockets.add(newU2);
        newU2 = new U1();
      }
    }
    return u2Rockets;
  }

  public int runSimulation(ArrayList<Rocket> rocketArrayList) {
    int cost = 0;
    for(Rocket rocket: rocketArrayList){
      cost += rocket.cost;
      while((!rocket.launch()) || (!rocket.land())) {
        cost += rocket.cost;
      }
    }
    return cost;
  }

}
