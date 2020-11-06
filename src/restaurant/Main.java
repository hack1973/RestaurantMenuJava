package restaurant;

//import Restaurant.Menu;
//import Restaurant.MenuItem;

public class Main {

    public static void main(String[] args) {


        Menu myMenu = new Menu();
        System.out.println(String.valueOf(myMenu.toString()));

        MenuItem superBurger = new MenuItem(
                "Cheese Burger",
                17.99,
                "World Best Burger",
                "main course");

        myMenu.addMenuItem(superBurger);

        System.out.println(String.valueOf(myMenu.toString()));

        MenuItem ChocolateCheeseCake = new MenuItem(
                "Chocolate Cheese Cake",
                10.99,
                "Best dessert",
                "dessert ");

        myMenu.addMenuItem(ChocolateCheeseCake);

        System.out.println(String.valueOf(myMenu.toString()));

        MenuItem invalidItem = new MenuItem(
                "Test Item",
                10.99,
                "A great test",
                "dessert ");

        myMenu.addMenuItem(invalidItem);
        System.out.println(String.valueOf(myMenu.toString()));

        printElements(myMenu);
    }

    public static void printElements(Menu aMenuM){
        for(MenuItem d: aMenuM.getMenus()){
            System.out.println(d);
        }
    }
}
