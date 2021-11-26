package enumExampleOne.applicationOrder;

import enumExampleOne.entities.enumsOrder.OrderStatus;
import enumExampleOne.entitiesOrder.Order;

import java.util.Date;
import java.util.Scanner;

public class ProgramOrder {
    public static void main (String [] args) {
        Order order = new Order(1000, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);


        Scanner sc = new Scanner(System.in);





        sc.close();
    }
}
