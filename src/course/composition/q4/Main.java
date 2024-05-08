package course.composition.q4;

import course.composition.q4.model.entities.Bank;
import course.composition.q4.model.exceptions.DomainException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter the account data");
            System.out.print("Number: ");
            int number = scan.nextInt();
            System.out.print("Holder: ");
            scan.nextLine();
            String holder = scan.nextLine();
            System.out.print("Initial Balance: ");
            double balance = scan.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = scan.nextDouble();

            System.out.print("\nEnter amount for withdraw: ");
            double amount = scan.nextDouble();

            Bank bank = new Bank(number, holder, balance, withdrawLimit);
            bank.withdraw(amount);

            System.out.println("New Balance: " + bank.getBalance());

        }catch (DomainException e){
            System.out.println(e.getMessage());
        }
        scan.close();
    }
}
