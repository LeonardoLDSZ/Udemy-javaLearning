package function.util;

import function.entities.ProductFunction;

import java.util.function.Function;
                                    //Recebe produto como argumento e retorna String como resposta
public class UpperCaseName implements Function<ProductFunction,String> {
    @Override
    public String apply(ProductFunction p){
        return p.getName().toUpperCase();
    }
}
