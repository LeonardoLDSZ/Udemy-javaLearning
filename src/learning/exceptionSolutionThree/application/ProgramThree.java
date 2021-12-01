package exceptionSolutionThree.application;

import exceptionSolutionThree.model.entities.ReservationThree;
import exceptionSolutionThree.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramThree {

    // ===========================================
    // ======== GOOD EXCEPTION SOLUTION =======
    // ===========================================

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
                System.out.print("Room number: ");
                int number = sc.nextInt();
                System.out.print("Check-in date (dd/MM/yyyy): ");
                Date checkIn = sdf.parse(sc.next());
                System.out.print("Check-out date (dd/MM/yyyy): ");
                Date checkOut = sdf.parse(sc.next());

                ReservationThree reservationThree = new ReservationThree(number, checkIn, checkOut);
                System.out.println("Reservation: " + reservationThree);

                System.out.println();
                System.out.print("Enter date to update the reservation: ");
                System.out.print("Check-in date (dd/MM/yyyy): ");
                checkIn = sdf.parse(sc.next());
                System.out.println("Check-out date (dd/MM/yyyy): ");
                checkOut = sdf.parse(sc.next());

                reservationThree.updateDates(checkIn, checkOut);
                System.out.print("Reservation: " + reservationThree);
        }
        catch (ParseException e) {
            System.out.print("Invalid date format");
        }
        catch (DomainException e){
            System.out.print("Error in reservation: " + e.getMessage());
        }

        catch (RuntimeException e ){
            System.out.print("Unexpected error");
        }

        sc.close();
    }
}
