package demo;

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

    public  void tilføjTilFil() {
        GroceryItemOrder ny;
        Scanner scan = new Scanner(System.in);
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("GroceryList.txt", true));
            System.out.println("Navn på vare");
            String navn = scan.nextLine();

            System.out.println("Hvor mange vare");
            int quantity = scan.nextInt();

            System.out.println("Pris per vare");
            double pris = scan.nextInt();

            ny = new GroceryItemOrder(navn, quantity, pris);
            ps.print(ny);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to write to file");
        }
    }

    
    @Override
    public String toString() {
        return "GroceryList{" +
                "orders=" + orders.toString() +
                '}';
    }
}





