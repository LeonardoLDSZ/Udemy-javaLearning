package generics.application;

import generics.services.PrintService;

import java.util.Scanner;
public class ProgramGenerics {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<String>();
        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0;i < n ;i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
