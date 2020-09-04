package demo;

public class Controller {

    FilHåndtering filHåndtering = new FilHåndtering();
    GroceryList groceryList;

    public void run(){
        groceryList = filHåndtering.læsFraFIl();

        System.out.println(groceryList.getOrdersSize());
    }



}
