package demo;

public class GroceryItemOrder {

   private String name;
   private int quantity;
   private int pricePerUnit;

    public GroceryItemOrder(String name, int quantity, int pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;


    }

    public GroceryItemOrder(String name) {
        this.name = name;
    }

    public int getCost(){
        return quantity * pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPricePerUnit() {
        return pricePerUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerUnit(int pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String toString() {
        return "name = " + name +
                " quantity = " + quantity +
                " Total Cost = " + quantity*pricePerUnit + "\n";

    }
}
