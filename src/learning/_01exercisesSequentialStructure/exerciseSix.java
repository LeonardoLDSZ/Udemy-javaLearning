package _01exercisesSequentialStructure;

import _01exercisesSequentialStructure.exerciseSixEntities.Geometry;

import java.util.Locale;
import java.util.Scanner;

public class exerciseSix {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
//        Em seguida, calcule e mostre:
//        a) a área do triângulo retângulo que tem A por base e C por altura.
//        b) a área do círculo de raio C. (pi = 3.14159)
//        c) a área do trapézio que tem A e B por bases e C por altura.
//        d) a área do quadrado que tem lado B.
//        e) a área do retângulo que tem lados A e B.
        Geometry geometry = new Geometry();
        System.out.print("Informe o valor A: ");
        geometry.A = sc.nextDouble();
        System.out.print("Informe o valor B: ");
        geometry.B = sc.nextDouble();
        System.out.print("Informe o valor C: ");
        geometry.C = sc.nextDouble();
        System.out.println();
        System.out.printf("TRIANGLE AREA: %.3f%n",geometry.areaTriangleRectangle());
        System.out.printf("CIRCLE AREA: %.3f%n",geometry.areaCircle());
        System.out.printf("TRAPEZE AREA: %.3f%n",geometry.areaTrapeze());
        System.out.printf("SQUARE AREA: %.3f%n",geometry.areaSquare());
        System.out.printf("RECTANGLE AREA: %.3f%n",geometry.areaRectangle());
       sc.close();

    }
}
