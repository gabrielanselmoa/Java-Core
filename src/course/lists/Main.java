package course.lists;

import course.lists.model.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        int id;
        String name;
        double salary;

        System.out.println("----------REGISTER EMPLOYEE-----------\n");
        System.out.println("How many employees will be registered?");
        int nEmployees = scan.nextInt();
        Employee employee;

        for (int i = 0; i < nEmployees; i++) {

            System.out.println("#" + (i + 1) + " Employee:");
            System.out.print("Id: ");
            id = scan.nextInt();
            scan.nextLine();
            System.out.print("Name: ");
            name = scan.nextLine();
            System.out.print("Salary: ");
            salary = scan.nextDouble();
            System.out.println();

            employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.println("-----------UPDATING SALARY----------\n");
        System.out.println("Which employee will receive an increase salary? Please enter their ID!");
        int emp_id = scan.nextInt();
        Integer pos = hasID(list, emp_id);

        if (pos != null){
            System.out.print("Choose the percentage that will be applied on their salary: ");
            double percent = scan.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println("Employees:");

        for (Employee emp : list){
            System.out.println(emp);
        }
        scan.close();
    }

    public static Integer hasID(List<Employee> employee_list, int id){
        for (int i = 0; i < employee_list.size(); i++) {
            if (employee_list.get(i).getId() == id){
                return i;
            };
        }
            return null;
    }
}
