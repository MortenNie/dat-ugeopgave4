import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<String> options = new ArrayList<>();

    Menu (ArrayList<String> a) {
      options = a;
    }

    public String showMenu() {
        System.out.println("Type a number to choose");
         for (int i = 0; i < options.size();i++ ) {
             System.out.println(options.get(i));

         }
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        return choice;
    }

}
