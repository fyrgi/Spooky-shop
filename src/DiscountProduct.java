
class DiscountProduct extends Product{
    double oldPrice;

    DiscountProduct(String name, double price, int availableQuantity, double discountPercent) {
        super(name, price, availableQuantity);
        // save the initial item's price for the final print.
        this.oldPrice=price;
        // set the price with the subtracted discount amount.
        super.setPrice(price-(price*checkPercent(discountPercent)));
    }
    // Here I want to show my used how big of a saving he does but showing Old and New price.
    @Override
    public String toString(){
        return getName() + " - Old price: " +oldPrice+ "kr. Current price: "+super.getPrice()+"kr. " + getQuantity() + "st in stock.";
    }

    // check the percent value. If it is unexpected treat it as no discount. Otherwise, do the correct math in the constructor.
    private double checkPercent(double discountPercent){
        if(discountPercent >0 && discountPercent < 1){
            return discountPercent;
        } else if(discountPercent > 1 && discountPercent <=100){
            discountPercent /= 100.00;
            return discountPercent;
        }
        else return 0;
    }

    // no need of getters and setters, but they can be added if our user will be able to add new items.
}
