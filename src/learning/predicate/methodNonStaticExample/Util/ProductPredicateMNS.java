package predicate.methodNonStaticExample.Util;
import predicate.methodNonStaticExample.Entities.ProductMNS;

import java.util.function.Predicate;

public class ProductPredicateMNS implements Predicate<ProductMNS> {

        @Override
        public boolean test(ProductMNS p) {
            return p.getPrice() >= 100.0;
        }
    }


