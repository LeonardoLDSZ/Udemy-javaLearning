package predicate.interfaceExample.application;

import predicate.interfaceExample.EntitiesInterface.InterfaceProduct;
import predicate.interfaceExample.Util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramInterface {
    public static void main (String [] args){
//==============================Interface funcional===============================
//=================================================================================

        Locale.setDefault(Locale.US);

        List<InterfaceProduct> list = new ArrayList<>();
        list.add(new InterfaceProduct("Tv", 900.00));
        list.add(new InterfaceProduct("Mouse", 50.00));
        list.add(new InterfaceProduct("Tablet", 350.50));
        list.add(new InterfaceProduct("HD Case", 80.90));

        list.removeIf(new ProductPredicate());

        for(InterfaceProduct p : list) {
            System.out.println(p);

        }
    }
}
