package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GroceryList {
    ArrayList<GroceryItemOrder> orders = new ArrayList<>();

    public String add(GroceryItemOrder order){
        orders.add(order);

        return "Order added succesfully";
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
                "orders=" + orders.toString() +
                '}';
    }
}





