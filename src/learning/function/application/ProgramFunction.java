package function.application;

import function.entities.ProductFunction;
import function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramFunction {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        List<ProductFunction> list = new ArrayList<>();

        list.add(new ProductFunction("TV", 900.00));
        list.add(new ProductFunction("Mouse",50.00));
        list.add(new ProductFunction("Tablet",200.00));
        list.add(new ProductFunction("HD case",80.90));



        //Function<ProductFunction, String> func = p -> p.getName().toUpperCase();


        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        // --- Referencia metodo não estatico ---
        //List<String> names = list.stream().map(ProductFunction::nonStaticUpperCaseName).collect(Collectors.toList());

        // --- Referencia metodo estatico ----
        //List<String> names = list.stream().map(ProductFunction::staticUpperCaseName).collect(Collectors.toList());

        // --- Expressão Lambda Declarada ----
        //Function<ProductFunction, String> func = p -> p.getName().toUpperCase();
        //List<String> names = list.stream().map(func).collect(Collectors.toList());

        // --- Expressão Lambda inline ----
        // List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());


        names.forEach(System.out::println);

    }
}
