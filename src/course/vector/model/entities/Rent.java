package course.vector.model.entities;

import java.util.Scanner;

public class Rent {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean[] rent = new boolean[10];
        String[] name = new String[10];
        String[] email = new String[10];
        int nStudents;

        System.out.println("How many students will rent the rooms?");
        nStudents = scan.nextInt();

        while (nStudents < 0 || nStudents > 10){
            System.out.println("Enter a valid value!!");
            System.out.println("There's only 10 rooms available!");
            System.out.println("How many students will rent the rooms?");
            nStudents = scan.nextInt();
        }

        System.out.println("Ok");

        for (int i = 0; i < nStudents; i++) {
            System.out.println("\nWhich room would like to rent?");
            System.out.println("| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
            int option = scan.nextInt();

            if (option < 0 || option > 9){
                System.out.println("Invalid value!!");
                while (option < 0 || option > 9){
                    System.out.println("\nWhich room would like to rent?");
                    System.out.println("| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
                    option = scan.nextInt();
                }
            }
            if (rent[option]){
                System.out.println("This room is already rented!!");
                while (rent[option]){
                    System.out.println("\nWhich room would like to rent?");
                    System.out.println("| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
                    option = scan.nextInt();
                }
            }
            System.out.println("What is your name?");
            scan.nextLine();
            name[option] = scan.nextLine();
            System.out.println("What is your email?");
            email[option] = scan.nextLine();
            System.out.printf("Ok, room %d is rented for %s!\n", option, name[option]);
            rent[option] = true;
        }

        System.out.println("Rooms rented:");
        for (int i = 0; i < 10; i++) {
            if (rent[i]){
                System.out.println("#" + i + " room - " + name[i] + " | " + email[i]);
            }
        }
        scan.close();
    }
}
