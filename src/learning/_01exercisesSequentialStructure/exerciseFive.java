package _01exercisesSequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class exerciseFive {
    public static void main(String [] args){
//        Fazer um programa para ler o código de uma peça 1, o número de peças 1,
//        o valor unitário de cada peça 1, o código de uma peça 2, o número de peças
//        2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Inform ID: ");
        String id1 = sc.nextLine();
        System.out.print("Tools quantity: ");
        int toolQuantity1 = sc.nextInt();
        System.out.print("Unity value: ");
        double toolValue1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Inform second ID: ");
        String id2 = sc.nextLine();
        System.out.print("Tools quantity: ");
        int toolQuantity2 = sc.nextInt();
        System.out.print("Unity value: ");
        double toolValue2 = sc.nextDouble();

        double totalPay1 = toolQuantity1 * toolValue1;
        double totalPay2 = toolQuantity2 * toolValue2;

        System.out.println();
        System.out.printf("Valor a pagar: R$ %.2f%n",totalPay1 + totalPay2);











        sc.close();








    }
}
