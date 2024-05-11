package course.composition.q1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the department's name:");
        Department department = new Department(scan.nextLine());
        System.out.println("Enter the Worker Data:");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Level: ");
        String level = scan.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = scan.nextDouble();
        System.out.println("How many contracts to this worker?");
        int nContracts = scan.nextInt();
        scan.nextLine();

        Worker worker = new Worker(name, Worker.WorkerLevel.valueOf(level), baseSalary, department);
        HourContract contract;

        for (int i = 0; i < nContracts; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data:");
            System.out.print("Date (dd/MM/yyyy): ");
            String initialDate = scan.next();
            Date cDate = sdf.parse(initialDate);
            DateTimeFormatter formatBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = scan.nextInt();
            scan.nextLine();

            contract = new HourContract(cDate, valuePerHour, duration);
            worker.addContract(contract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String yearAndMonth = scan.nextLine();
        int month = Integer.parseInt(yearAndMonth.substring(0, 2));
        int year = Integer.parseInt(yearAndMonth.substring(3, 7));
        System.out.print("Name: " + worker.getName() + "\n");
        System.out.print("Department: " + worker.getDepartment().getName() + "\n");
        System.out.println("Income for " + "(" + yearAndMonth + ")" + ":");

        System.out.println(worker.income(month, year));
        scan.close();
    }
}
