import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Simulation simulation = new Simulation();
        int u1RocketP1 = simulation.runSimulation(simulation.loadU1(simulation.loadItems(new File("phase-1.txt"))));
        int u1RocketP2 = simulation.runSimulation(simulation.loadU1(simulation.loadItems(new File("phase-2.txt"))));

        int u2RocketP1 = simulation.runSimulation(simulation.loadU2(simulation.loadItems(new File("phase-1.txt"))));
        int u2RocketP2 = simulation.runSimulation(simulation.loadU2(simulation.loadItems(new File("phase-2.txt"))));

        System.out.println(u1RocketP1+"\n"+ u1RocketP2+"\n"+ u2RocketP1+"\n"+ u2RocketP2);
    }
}