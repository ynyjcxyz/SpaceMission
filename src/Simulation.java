import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

  public ArrayList<Item> loadItems(File file) throws FileNotFoundException {
    Scanner scanner = new Scanner(file);
    ArrayList<Item> result = new ArrayList<Item>();

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String name = line.substring(0, line.indexOf("="));
      String kgAString = line.substring(name.length());
      int kgAsInt = Integer.parseInt(kgAString);
      int tonne = kgAsInt / 1000;
      Item item = new Item(name, tonne);
      result.add(item);
    }

    return result;
  }

  public ArrayList<Item> loadU1() throws FileNotFoundException {
    return loadItems(new File("phase-1.txt"));
  }

  public ArrayList<Item> loadU2() throws FileNotFoundException {
      return loadItems(new File("phase-2.txt"));
  }

  public int runSimulation() {
    return 0;
  }

}
