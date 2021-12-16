package predicate.declaredLambdaExpression.utilLambda;
import predicate.declaredLambdaExpression.entitiesLambda.ProductLambda;

import java.util.function.Predicate;

public class PredicateProductLambda implements Predicate<ProductLambda> {

    @Override
    public boolean test(ProductLambda p) {
        return p.getPrice() >= 100.0;
    }
}
