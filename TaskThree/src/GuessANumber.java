import java.util.Random;
import java.util.Scanner;


public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess() {
             //man skal taste tallet ind 2 gange før det virker. Jeg fatter det ikke. Enter virker ikke første gang skipper bare til ny linje.
        try {
            Scanner sc = new Scanner(System.in);
            sc.hasNextInt();

            if (sc.nextInt() == rnd_number) {
                System.out.println("It was the right number!");

            } else if (sc.nextInt() < rnd_number) {
                System.out.println("Wrong! Your Number was less than the number!");
                makeAGuess();


            } else {
                System.out.println("Wrong! Your Number was greater than the number!");
                makeAGuess();

            }

        } catch (Exception e) {
            System.out.println("please enter a number");
             makeAGuess();
        }

    }

}






