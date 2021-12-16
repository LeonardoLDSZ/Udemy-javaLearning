package predicate.methodNonStaticExample.application;
import predicate.methodNonStaticExample.Entities.ProductMNS;


import java.util.ArrayList;

import java.util.List;
import java.util.Locale;

public class ProgramReferenceMethodNonStatic {
    public static void main (String [] args){
//==============================Reference Method Non Static ===========================
//=================================================================================

        Locale.setDefault(Locale.US);

        List<ProductMNS> list = new ArrayList<>();
        list.add(new ProductMNS("Tv", 900.00));
        list.add(new ProductMNS("Mouse", 50.00));
        list.add(new ProductMNS("Tablet", 350.50));
        list.add(new ProductMNS("HD Case", 80.90));

        list.removeIf(ProductMNS::nonStaticProductPredicateMNS);

        for(ProductMNS p : list) {
            System.out.println(p);

        }
    }
}