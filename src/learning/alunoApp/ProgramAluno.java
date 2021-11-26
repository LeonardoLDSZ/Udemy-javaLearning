package alunoApp;

import alunoEntities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAluno {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.print("Informe o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Primeira nota: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        aluno.nota3 = sc.nextDouble();
        System.out.println();
        System.out.printf("Nota final: %.2f%n", aluno.notaFinal());
        System.out.println();
        if (aluno.notaFinal() < 60.0) {
            System.out.println("Reprovado");
            System.out.println();
            System.out.printf("Faltou %.2f pontos %n", aluno.pontosFaltantes());
        }
        else
        {
            System.out.println("Aprovado");
        }
        sc.close();
    }

}
