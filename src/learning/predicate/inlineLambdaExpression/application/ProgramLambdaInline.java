package predicate.inlineLambdaExpression.application;

import predicate.inlineLambdaExpression.lambdaInline.ProductLambdaInline;

import java.util.ArrayList;
import java.util.List;


public class ProgramLambdaInline {

    public static void main(String[] args) {
        List<ProductLambdaInline> list = new ArrayList<>();
        list.add(new ProductLambdaInline("Tv", 900.00));
        list.add(new ProductLambdaInline("Mouse", 50.00));
        list.add(new ProductLambdaInline("Tablet", 350.50));
        list.add(new ProductLambdaInline("HD Case", 80.90));

        double min = 100.0;
        list.removeIf(p -> p.getPrice() >= min);

        for (ProductLambdaInline p : list) {
            System.out.println(p);
        }
    }
}
