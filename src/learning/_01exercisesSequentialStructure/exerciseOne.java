package _01exercisesSequentialStructure;

import java.util.Scanner;

public class exerciseOne {

    public static void main (String [] args){

//   Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//   mensagem explicativa, conforme exemplos.

        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        System.out.println("Soma é = " + soma);


        sc.close();
    }
}
