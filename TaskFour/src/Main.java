import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        Menu m = new Menu(actions);

        String n = m.showMenu();
        int convertedResponse = Integer.parseInt(n);

        doAction(convertedResponse);

    }

    public static void doAction(int action) {
        switch(action) {
            case 1:
                System.out.println("Starting the game now");
                break;

            case 2:
                System.out.println("Fetching previously saved game data");
                break;


            case 3:
                System.out.println("Game paused");
                break;

            case 4:
                System.out.println("Ending game");
                break;
        }



        }


    }



