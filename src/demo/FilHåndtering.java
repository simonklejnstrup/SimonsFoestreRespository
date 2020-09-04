package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FilHåndtering {

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
            int pris = scan.nextInt();

            ny = new GroceryItemOrder(navn, quantity, pris);
            ps.print(ny);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to write to file");
        }
    }

    public GroceryList læsFraFIl() {
        GroceryList groceryList = new GroceryList();
        File file = new File("GroceryList.txt");
        try (Scanner scan = new Scanner(file)) {
            //scan.useDelimiter(" ");
            while (scan.hasNextLine()) {
                String navn = scan.next();
                int quantity = scan.nextInt();
                int pris = scan.nextInt();

                System.out.println(groceryList.add(new GroceryItemOrder(navn, quantity, pris)));
                System.out.println(groceryList.getOrdersSize());
                //groceryList.add(new GroceryItemOrder(navn, quantity, pris));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return groceryList;
    }

}
