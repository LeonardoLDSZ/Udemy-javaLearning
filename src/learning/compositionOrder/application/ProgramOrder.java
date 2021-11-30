package compositionOrder.application;
import compositionOrder.entities.Client;
import compositionOrder.entities.Order;
import compositionOrder.entities.OrderItem;
import compositionOrder.entities.Product;
import compositionOrder.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramOrder {
    public static void main (String [] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product();
        OrderItem oi1 = new OrderItem();

        SimpleDateFormat sdfBirth = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("======== Enter client data ========");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdfBirth.parse(sc.next());
        System.out.println();

        Client client = new Client(name, email, birthDate);

        System.out.println("======== Enter order data ========");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        Integer n = sc.nextInt();
        System.out.println();

        for (int i=1;i<=n;i++){
            System.out.println("======== Enter #" + i + " item data ========");
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            System.out.println();

            Product product = new Product(productName, productPrice);
            OrderItem it = new OrderItem(quantity, productPrice,product);
            order.addItem(it);
        }

        System.out.println();
        System.out.print(order);


        sc.close();
    }
}
