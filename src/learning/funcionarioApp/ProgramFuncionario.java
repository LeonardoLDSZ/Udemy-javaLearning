package funcionarioApp;
import funcionarioEntities.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class ProgramFuncionario {

        public static void main (String [] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Funcionario funcionario = new Funcionario();

            System.out.print("Nome do funcionário: ");
            funcionario.nome = sc.nextLine();
            System.out.print("Gross Salary: ");
            funcionario.salarioBruto = sc.nextDouble();
            System.out.print("Tax: ");
            funcionario.taxa = sc.nextDouble();

            System.out.println();
            System.out.println("Funcionario: " + funcionario);
            System.out.println();
            System.out.print("Qual a porcentagem de aumento: ");
            double percentage = sc.nextDouble();
            funcionario.aumentoSalario(percentage);

            System.out.println();
            System.out.println("Atualização: " + funcionario);
            sc.close();


        }

}
