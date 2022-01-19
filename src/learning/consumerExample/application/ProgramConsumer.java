package consumerExample.application;

import consumerExample.entities.ProductConsumer;
import consumerExample.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramConsumer {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        List<ProductConsumer> list = new ArrayList<>();

        list.add(new ProductConsumer("TV", 900.00));
        list.add(new ProductConsumer("Mouse",50.00));
        list.add(new ProductConsumer("Tablet",200.00));
        list.add(new ProductConsumer("HD case",80.90));

        list.forEach(new PriceUpdate());
        list.forEach(System.out::println); //reference method para o println

    }

}
