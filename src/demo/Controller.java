package demo;

public class Controller {

    FilHåndtering filHåndtering = new FilHåndtering();
    GroceryList groceryList = new GroceryList();

    public void run(){
        filHåndtering.læsFraFIl();

        System.out.println(groceryList.getOrdersSize());
    }



}
