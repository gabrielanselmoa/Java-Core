package course.vector.model.entities;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many grades will you need to calculate.");
        int numbers = scan.nextInt();
        double[] grades = new double[numbers];
        double sum = 0;

        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter a grade:");
            grades[i] = scan.nextDouble();
            sum += grades[i];
        }
        System.out.print("Values: ");
        for (double g:grades){
            System.out.print(g + " | ");
        }
        System.out.printf("\nSum: %.2f\n", sum);
        System.out.printf("Average: %.2f\n", (sum/numbers));

        scan.close();
    }
}
