package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class GroceryList {
    GroceryItemOrder[] orders = new GroceryItemOrder[10];

    public void add(GroceryItemOrder order) {

        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                orders[i] = order;
                break;
            }
        }
    }
        //METODE ER IKKE FÆRDIG

    public GroceryItemOrder[] getOrderList(){
        return orders;
    }

    public  void tilføjTilFil() {
        GroceryItemOrder ny;
        Scanner scan = new Scanner(System.in);
        try{
            PrintStream ps = new PrintStream(new FileOutputStream("GroceryList.txt",true));
            System.out.println("Navn på vare");
            String navn = scan.nextLine();

            System.out.println("Hvor mange vare");
            int quantity = scan.nextInt();

            System.out.println("Pris per vare");
            double pris = scan.nextInt();

            ny = new GroceryItemOrder(navn,quantity,pris);
            ps.print(ny);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to write to file");
        }



    }
}


