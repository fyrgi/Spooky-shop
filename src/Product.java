public class Product {
    private int availableQuantity;
    private String name;
    private double price;

    Product(String name, double price, int availableQuantity){
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.price = price;
    }
    // another implementation of your info() methods. We haven't talked about toString, but I know about it from before.
    public String toString(){
        return name + " - price: " +price+ "kr. " + availableQuantity + "st in stock.";
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return availableQuantity;
    }

    public void setQuantity(int quantity) {
        this.availableQuantity = quantity;
    }
    public double getPrice() {
        return price;
    }

    //used in the child class only to store the discounted price.
    public void setPrice(double price) {
        this.price = price;
    }

}
