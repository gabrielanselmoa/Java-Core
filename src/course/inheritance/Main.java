package course.inheritance;

import course.inheritance.model.entities.Employee;
import course.inheritance.model.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int nEmployees = scan.nextInt();
        List<Employee> listEmployee = new ArrayList<>();

        for (int i = 0; i < nEmployees; i++) {
            System.out.println("\nEmployee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char answer = scan.next().charAt(0);
            scan.nextLine();

            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Hours: ");
            Integer hours = scan.nextInt();
            System.out.print("Value per Hours: ");
            Double valuePerHours = scan.nextDouble();

            if (answer == 'y'){
                System.out.print("Additional Charge: ");
                Double addtionalCharge = scan.nextDouble();

                OutsourcedEmployee outEmployee = new OutsourcedEmployee(name, hours, valuePerHours, addtionalCharge);
                listEmployee.add(outEmployee);
            }

            if (answer == 'n'){
                Employee employee = new Employee(name, hours, valuePerHours);
                listEmployee.add(employee);
            }
        }

        System.out.println("\nPAYMENTS:\n");
        for (Employee emp : listEmployee){
            System.out.println(emp.getName() + " - " + "$ " + emp.payment());
        }

        scan.close();
    }
}
