package exceptionExercise.application;

import exceptionExercise.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            System.out.println("Account information: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Owner: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Openning Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number,holder,balance,withdrawLimit);
            System.out.println();
            System.out.print("Informe a quantia para sacar: ");
            double amount = sc.nextDouble();

            acc.withdraw(amount);
            System.out.printf("Novo saldo: " + String.format("%.2f%n", acc.getBalance()));
        sc.close();
    }
}
