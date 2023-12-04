import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Black cat", 120, 12));
        products.add(new Product("Frog leg", 80.99, 68));
        products.add(new DiscountProduct("Witch hat", 100,3,0.6 ));

        Scanner scanner = new Scanner(System.in);
        Client c = new Client();
        int menuOption = 0;
        do{
            showMenu(products);
            System.out.print("\nWhich witch item would you like to purchase? >> ");
            menuOption = scanner.nextInt();
            if(menuOption > 0 && menuOption <= products.size()){
                c.addToShoppingBag(menuOption, products);
            }

        } while(menuOption != products.size()+1);
        c.showMeTheMoney();
    }

    public static void showMenu(ArrayList<Product> products){
        int itemsCount = 0;
        for (Product product : products) {
            System.out.println(++itemsCount +". " + product.toString());
        }
        System.out.println(++itemsCount +". Confirm and exit");
    }
}