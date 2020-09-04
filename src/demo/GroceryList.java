package demo;

public class GroceryList {
    GroceryItemOrder[] orders = new GroceryItemOrder[10];

    public void add(GroceryItemOrder order){
        for (int i = 0; i <orders.length ; i++) {
            if (orders[i] == null){
                orders[i] = order;
                break;
            }
        }

        //METODE ER IKKE FÆRDIG




    }
}



