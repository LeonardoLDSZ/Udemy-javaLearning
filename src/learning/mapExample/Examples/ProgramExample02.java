package mapExample.Examples;
import mapExample.Examples.EntitiesExample.ProductMap02;
import java.util.HashMap;
import java.util.Map;

public class ProgramExample02 {
    public static void main (String [] args) {
        Map<ProductMap02,Double> stock = new HashMap<>();

        ProductMap02 p1 = new ProductMap02("TV", 900.0);
        ProductMap02 p2 = new ProductMap02("Notebook", 1000.0);
        ProductMap02 p3 = new ProductMap02("Tablet", 540.0);

        //Quantidade de produtos em stock
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        ProductMap02 ps = new ProductMap02("TV", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}
