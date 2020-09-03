package demo;

public class GroceryList {
    String[] orders = new String[10];

    public void add(String order){
        for (int i = 0; i <orders.length ; i++) {
            if (orders[i] == null){
                orders[i] = order;
                break;
            }
        }

        //METODE ER IKKE FÆRDIG




    }
}



