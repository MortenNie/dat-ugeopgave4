import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please type your name");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("Name: " + name);

        System.out.println("Please type your age");
        int age = sc.nextInt();
        System.out.println("Age: " + age);

        int result = 67 - age;
        System.out.println("You can retire in " + result + " years");

    }
}