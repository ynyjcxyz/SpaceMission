import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class Simulation {

    public ArrayList loadItems(File file) throws FileNotFoundException {
        //File file_1 = new File("phase-1.txt");
        //File file_2 = new File("phase-2.txt");
        Scanner scanner_1 = new Scanner(file);
        //Scanner scanner_2 = new Scanner(file_2);
        ArrayList<Item> lists_original = new ArrayList<Item>();
        ArrayList<String> name_1 = new ArrayList<String>();
        ArrayList<Integer> weight_1 = new ArrayList<Integer>();

        while(scanner_1.hasNextLine()){
            String line_1 = scanner_1.nextLine();
            String line_1_name = line_1.substring(0, line_1.indexOf("="));
            String line_1_weight_temp = line_1.substring(line_1_name.length());
            int line_1_weight = Integer.valueOf(line_1_weight_temp).intValue();
            name_1.add(line_1_name);
            weight_1.add(line_1_weight/1000);
        }

        for(int i = 0; i< name_1.size();i++){
            lists_original.get(i).name = name_1.get(i);
            lists_original.get(i).weight = weight_1.get(i);
        }

        return lists_original;
    }

    public ArrayList loadU1(){
        return null;
    }

    public ArrayList loadU2(){
        return null;
    }

    public int runSimulation(){
        return 0;
    }

}
