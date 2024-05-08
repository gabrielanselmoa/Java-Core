package course.vector.model.entities;

import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Vector Exercises!!");
        System.out.println("Please, tell me how many numbers would you like to test?");
        int numbers = scan.nextInt();
        int[] integers_n = new int[numbers];

        for (int i = 0; i < numbers; i++){
            System.out.println("Enter a number (+ | -):");
            integers_n[i] = scan.nextInt();

            if (integers_n[i] > 10) {
                System.out.println("The MAX value is 10!");
                continue;
            }
        }
        System.out.println("NEGATIVE:");
        for (int i = 0; i < numbers; i++){
            if (integers_n[i] < 0){
                System.out.println(integers_n[i]);
            }
        }
        scan.close();
    }
}
