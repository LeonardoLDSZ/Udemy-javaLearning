package _01exercisesSequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class exerciseTwo {
    public static void main (String [] args){
//  Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor
//  da área deste círculo com quatro casas decimais conforme exemplos.
//  Fórmula da área: area = π . raio2
//  Considere o valor de π = 3.14159
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        System.out.print("Informe o primeiro raio: ");
        double raioOne = sc.nextDouble();
        System.out.print("Informe o segundo raio: ");
        double raioTwo = sc.nextDouble();
        System.out.print("Informe o terceiro raio: ");
        double raioThree = sc.nextDouble();
        double areaOne = pi * (raioOne * raioOne);
        double areaTwo = pi * (raioTwo * raioTwo);
        double areaThree = pi * (raioThree * raioThree);
        System.out.println();
        System.out.printf("A área do circulo um é de: %.4f%n", areaOne);
        System.out.printf("A área do circulo dois é de: %.4f%n", areaTwo);
        System.out.printf("A área do circulo três é de: %.4f%n", areaThree);
        sc.close();


    }
}
