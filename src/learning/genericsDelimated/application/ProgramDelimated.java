package genericsDelimated.application;

import genericsDelimated.entities.Product;
import genericsDelimated.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramDelimated {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\note-novo\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Most expensive item: ");
            System.out.print(x);
        }
        catch (IOException e){
            System.out.print("Error: " + e.getMessage());
        }
    }
}
