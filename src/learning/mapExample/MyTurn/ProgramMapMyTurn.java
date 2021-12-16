package mapExample.MyTurn;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class ProgramMapMyTurn {

    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Map<String, Double> cookies = new TreeMap<>();
        cookies.put("employee", Double.valueOf("2000.00"));
        cookies.put("averageSalary", Double.valueOf("2500.00"));
        cookies.put("wishSalary", Double.valueOf("3400.00"));

        cookies.remove("averageSalary");

        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()){
            System.out.println(key + ": $" + cookies.get(key));
        }

    }
}
