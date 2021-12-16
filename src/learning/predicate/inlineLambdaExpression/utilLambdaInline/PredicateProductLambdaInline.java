package predicate.inlineLambdaExpression.utilLambdaInline;

import predicate.inlineLambdaExpression.lambdaInline.ProductLambdaInline;

import java.util.function.Predicate;

public class PredicateProductLambdaInline implements Predicate<ProductLambdaInline> {


    @Override
    public boolean test(ProductLambdaInline p) {
        return p.getPrice() >= 100.0;
    }
}
