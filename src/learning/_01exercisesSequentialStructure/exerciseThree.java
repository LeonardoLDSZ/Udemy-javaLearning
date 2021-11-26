package _01exercisesSequentialStructure;

import java.util.Scanner;

public class exerciseThree {
    public static void main (String [] args){
//        Fazer um programa para ler quatro valores inteiros A, B, C e D.
//        A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
//        segundo a fórmula: DIFERENCA = (A * B - C * D).
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe A: ");
        int A = sc.nextInt();
        System.out.print("Informe B: ");
        int B = sc.nextInt();
        System.out.print("Informe C: ");
        int C = sc.nextInt();
        System.out.print("Informe D: ");
        int D = sc.nextInt();
        int diff = (A * B - C * D);
        System.out.println("A diferença é de: " + diff);

        sc.close();
    }
}
