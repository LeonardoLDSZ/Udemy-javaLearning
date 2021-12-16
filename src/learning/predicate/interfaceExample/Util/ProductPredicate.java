package predicate.interfaceExample.Util;
import predicate.interfaceExample.EntitiesInterface.InterfaceProduct;
import java.util.function.Predicate;

public class ProductPredicate implements Predicate<InterfaceProduct> {

    @Override
    public boolean test(InterfaceProduct p) {
        return p.getPrice() >= 100.0;
    }
}
