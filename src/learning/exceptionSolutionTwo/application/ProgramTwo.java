package exceptionSolutionTwo.application;

import exceptionSolutionTwo.model.entities.ReservationTwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramTwo {
    // ===========================================
    // ======== AVERAGE EXCEPTION SOLUTION =======
    // ===========================================

    public static void main (String [] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        Date now = new Date();
        if(((!checkOut.after(checkIn) || ((checkIn.before(now) || (checkOut.before(now)))))))
        {
            System.out.println("Error in reservation: Check-out date must be after check-in date!");
        }
        else {
            ReservationTwo reservationTwo = new ReservationTwo(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservationTwo);

            System.out.println();
            System.out.println("Enter date to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            String error = reservationTwo.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.print("Reservation: " + reservationTwo);
            }
        }
        sc.close();
    }
}
