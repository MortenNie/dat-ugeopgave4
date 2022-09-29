import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    ArrayList<String> coffeeMenu = new ArrayList<>();





public  void loadMenuData() {

    File file = new File("C:\\Users\\Morten\\Documents\\projects\\TaskSix\\coffees.txt");
    try {
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            coffeeMenu.add(sc.nextLine());

        }


    } catch(FileNotFoundException e) {
        System.out.println("Filen blev ikke fundet");

    }

  }


}

