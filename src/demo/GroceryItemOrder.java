package demo;

public class GroceryItemOrder {

   private String name;
   private int quantity;
   private double pricePerUnit;

    public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public GroceryItemOrder(String name) {
        this.name = name;
    }

    public double getCost(){
        return quantity * pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String toString() {
        return "CroceryItemOrder" +
                "name = " + name +
                " quantity = " + quantity +
                " Total Cost = " + quantity*pricePerUnit;

    }
}
