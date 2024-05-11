package course.composition.q3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        try {
            Scanner scan = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Reservation Program:");
            System.out.print("Room Number:");
            int roomNumber = scan.nextInt();
            scan.nextLine();
            System.out.print("Check-In Date (dd/MM/yyyy):");
            Date checkIn = sdf.parse(scan.nextLine());
            System.out.print("Check-Out Date (dd/MM/yyyy):");
            Date checkOut = sdf.parse(scan.nextLine());

            if (!checkOut.after(checkIn)){
                System.out.println("Error in Reservation: Check-Out must be after than Check-In");
            }else{
                Reservation reservation = new Reservation(roomNumber,checkIn, checkOut);
                System.out.println("\nReservation Data:");
                System.out.println(reservation);
            }
            scan.close();
        }
        catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
