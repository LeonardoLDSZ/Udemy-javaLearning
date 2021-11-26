package _01exercisesSequentialStructure;

import _01exercisesSequentialStructure.exerciseFourEntities.SalaryEmployee;

import java.util.Locale;
import java.util.Scanner;

public class exerciseFour {
    public static void main (String [] args){
    //Fazer um programa que leia o número de um funcionário, seu número de
    // horas trabalhadas, o valor que recebe por hora e calcula o salário
    //desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
    //decimais.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SalaryEmployee salaryEmployee = new SalaryEmployee();

        System.out.print("Employee ID: ");
        salaryEmployee.id = sc.nextLine();
        System.out.print("Worked hours: ");
        salaryEmployee.hours = sc.nextInt();
        System.out.print("Hour value: ");
        salaryEmployee.hoursValue = sc.nextDouble();
        System.out.println();

        System.out.println("EMPLOYEE ID: " + salaryEmployee.id);
        System.out.printf("SALARY: U$%.2f%n ", salaryEmployee.salary());
//        System.out.println();
//        System.out.println("EMPLOYEE ID: " + id);
//        System.out.printf("SALARY: U$%.2f%n", salary);
//        System.out.println();
//        System.out.println("EMPLOYEE ID: " + id);
//        System.out.printf("SALARY: U$%.2f%n", salary);






        sc.close();

    }
}
