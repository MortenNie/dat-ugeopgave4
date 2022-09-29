public class Main {
    public static void main(String[] args) {
     Cafe c = new Cafe();
     c.loadMenuData();
     for (int i = 0; i < c.coffeeMenu.size(); i++) {
         System.out.println(c.coffeeMenu.get(i));

     }

    }
}