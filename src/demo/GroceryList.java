package demo;

import java.util.Arrays;

public class GroceryList {
    GroceryItemOrder[] orders = new GroceryItemOrder[10];

    public String add(GroceryItemOrder order){
        for (int i = 0; i <orders.length ; i++) {
            if (orders[i] == null){
                orders[i] = order;
                break;
            }
        }
        boolean empty = true;
        for (GroceryItemOrder o : orders) {
            if (o != null) {
                empty = false;
                break;
            }
        }
        String message = "";
        if (empty){
            message = "Grocerylist is full. Order not added.";
        } else {
            message = "Order added succesfully";
        }
        return message;
    }

    public double getTotalCost(){
        double sum = 0;
        for (GroceryItemOrder o : orders) {
            sum += o.getCost();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "orders=" + Arrays.toString(orders) +
                '}';
    }
}



