package productApp;
import productEntities.Products;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
   public static void main(String [] args){
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       Products products = new Products();
       System.out.println("==== Enter product data ====");
       System.out.print("Name: ");
       products.name = sc.nextLine();
       System.out.print("Price: ");
       products.price = sc.nextDouble();
       System.out.print("Quantity: ");
       products.quantity = sc.nextInt();

       System.out.println();

       System.out.println("Products data: " + products);
       System.out.println("Enter the products to be added to stock: ");
       int quantity = sc.nextInt();
       products.addProduct(quantity);

       System.out.println();
       System.out.println("Update data: " + products);

       System.out.println("Enter the products to be removed from stock: ");
       quantity = sc.nextInt();
       products.removeProduct(quantity);

       System.out.println();
       System.out.println("Update data: " + products);
       sc.close();
   }
}
