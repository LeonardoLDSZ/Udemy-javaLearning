package functionsFunctions;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramFunctionsFunctions {

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        List<ProductFunctionsFunctions> list = new ArrayList<>();

        list.add(new ProductFunctionsFunctions("TV", 900.00));
        list.add(new ProductFunctionsFunctions("Mouse", 50.00));
        list.add(new ProductFunctionsFunctions("Tablet", 200.00));
        list.add(new ProductFunctionsFunctions("HD case", 80.90));

        ProductServiceFunctionsFunctions ps = new ProductServiceFunctionsFunctions();
        double sum = ps.filteredSum(list,p ->p.getPrice() < 100.0);

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
