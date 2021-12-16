package predicate.methodStaticExample.application;
import predicate.methodStaticExample.Entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramReferenceMethodStatic {
    public static void main (String [] args){
//==============================Reference Method Static ===========================
//=================================================================================

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(Product::staticProductPredicate);

        for(Product p : list) {
            System.out.println(p);

        }
    }
}
