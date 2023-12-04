import java.util.ArrayList;

public class Client {
    private double total;
    private int purchasedGoods;

    // this method's proper name would be something like printTotals() or confirmAndExit(). But a little bit of jokes should be okay.
    public void showMeTheMoney(){
        System.out.printf("You have %s items in your witch's cauldron. Total: %.2f SEK", purchasedGoods, total);
    }
    // I assumed that get and set won't do me a big of a favor here so this is my preferred approach to increase te values.
    public void addToBasket(double price){
        purchasedGoods++;
        total += price;
        //System.out.println(total); I do a lot of prints to check the evolution of a value.
    }

    public void addToShoppingBag(int menuChoice, ArrayList<Product> products) {
        //prepare the quantity of the current item for checkup and edit.
        int newQnt = products.get(menuChoice - 1).getQuantity();
        //add the item to the basket only if the product's quantity is 1 or more.
        if (products.get(menuChoice - 1).getQuantity() > 0) {
            addToBasket(products.get(menuChoice - 1).getPrice()); // send the price of the item to the client method.
            products.get(menuChoice - 1).setQuantity(--newQnt); // change the quantity
            System.out.printf("\n======= %s added to the witch's cauldron\n", products.get(menuChoice - 1).getName());
        }
    }
}
