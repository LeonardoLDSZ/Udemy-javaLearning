package comparator.Example.application;

import comparator.Example.Entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); //Comparando produto por nome, idependemente de letras maiusculas ou minúsculoas
    }
}
