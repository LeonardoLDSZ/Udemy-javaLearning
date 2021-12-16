package predicate.declaredLambdaExpression.application;
import predicate.declaredLambdaExpression.entitiesLambda.ProductLambda;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;

public class ProgramLambdaExpress {
    public static void main (String [] args){

//=================================================================================
//============================== Declared Lambda Expression =======================
//=================================================================================

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<ProductLambda> list = new ArrayList<>();
        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        System.out.print("Inform the value: ");
        double min = sc.nextDouble();

        Predicate<ProductLambda> pred = p -> p.getPrice() >= min;
        list.removeIf(pred);

        if (min < 50.0) {
            System.out.print("Product not found");
        }
        else {
            System.out.println("Found these items: ");
        }

        for(ProductLambda p : list) {
            System.out.println(p);
        }

        sc.close();
    }
}
