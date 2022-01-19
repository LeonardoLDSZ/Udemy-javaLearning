package functionsFunctions;
import java.util.List;
import java.util.function.Predicate;

public class ProductServiceFunctionsFunctions {
    public double filteredSum(List<ProductFunctionsFunctions> list, Predicate<ProductFunctionsFunctions> criteria) {
        //filteredSum - soma filtrada
        double sum = 0.0;
        for (ProductFunctionsFunctions p : list){
            if (criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}