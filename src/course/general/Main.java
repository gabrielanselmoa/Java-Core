package course.general;

import course.general.model.entities.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n-----------Welcome to BankDev-----------\n");
        System.out.println("Do you already have an account with us?");
        System.out.println("YES | NO");
        String decision = scan.next();
        scan.nextLine();
        if (decision.equals("NO")){
            System.out.println("### --------------- ###");
            System.out.println("Creating your account...");
            System.out.println("What is your legal name?");
            //String username = scan.nextLine();
            //scan.nextLine();
            Bank account = new Bank(scan.nextLine());
            System.out.println("Welcome, " + account.getHolder());
            System.out.println("Here's your account number. Save it, because it's unique!");
            System.out.println(account.getAccountNumber());
            System.out.println(account.getHolder() + ", would you like to deposit any value?");
            System.out.println("YES | NO");
            decision = scan.next();
            if (decision.equals("YES")){
                System.out.println("How many would you like to deposit into your account?");
                account.setDeposit(scan.nextDouble());
            }else{
                System.out.println("Ok, we can add something later!");
            }
            System.out.println("\n----------INFO-----------");
            account.info();

            System.out.println("Would you like to do something more?");
            System.out.println("YES | NO");
            decision = scan.next();
            if (decision.equals("YES")){
                System.out.println("It's a pleasure to have you with us!!");
                System.out.println("For your privacy, please type your Number Account below!");
                double account_number = scan.nextDouble();
                scan.nextLine();
                if (account_number == account.getAccountNumber()){
                    System.out.println("\n###-------------------------------------###");
                    System.out.println("What would you like to do today?");
                    System.out.println("#1 - Holder");
                    System.out.println("#2 - Deposit");
                    System.out.println("#3 - Withdraw");
                    System.out.println("#4 - Info");
                    System.out.println("###-------------------------------------###");
                    decision = (String) scan.nextLine();
//                    scan.nextLine();
                    if (decision.equals("1")){
                        System.out.println("Enter the new holder here:");
                        account.setHolder(scan.nextLine());
                        System.out.println("\nOperation completed successfully!!\n");
                        account.info();
                    }
                    if (decision.equals("2")){
                        System.out.println("Let's make a new deposit:");
                        System.out.println("How many would you like to deposit?");
                        account.setDeposit(scan.nextDouble());
                        System.out.println("\nOperation completed successfully!!\n");
                        account.info();
                    }
                    if (decision.equals("3")){
                        System.out.println("We have a nice tax of 5$ to withdraw a value.");
                        System.out.println("How many would you like to withdraw from your account?");
                        account.setWithdraw(scan.nextDouble());
                        System.out.println("\nOperation completed successfully!!\n");
                        account.info();
                    }
                    if (decision.equals("4")){
                        account.info();
                    }
                }else{
                    System.out.println("Sorry, the Account Number is incorrect!");
                }
            }
        }
        System.out.println("\nOk, see you next time then!!");
        scan.close();
    }
}