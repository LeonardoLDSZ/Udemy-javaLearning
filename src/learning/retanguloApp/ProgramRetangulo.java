package retanguloApp;
import retanguloEntities.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class ProgramRetangulo {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Retangulo retangulo = new Retangulo();

        System.out.print("Enter the width: ");
        retangulo.width = sc.nextDouble();
        System.out.print("Enter the height: ");
        retangulo.height = sc.nextDouble();

        System.out.println();
        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());









        sc.close();


    }

}
