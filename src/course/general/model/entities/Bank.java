package course.general.model.entities;

public class Bank {

    private String holder;
    private final double AC;
    private double deposit;
    private double withdraw;
    private double balance;

    //Constructor
    public Bank(String username){
        this.holder = username;
        this.AC = Math.random() * 10000;
        this.deposit = 0.0;
        this.balance = 0.0;
    }
    //Methods
    public String getHolder(){
        return this.holder;
    }
    public void setHolder(String holder){
        if (holder.equals(this.holder)){
            System.out.println("The new name is equals to the old one, please type a different name!");
        }else {
            this.holder = holder;
        }
    }
    public double getAccountNumber(){
        return (int) this.AC;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setDeposit(double deposit){
        if (deposit <= 0){
            System.out.println("Sorry, to deposit a value, it has to be greater than $ 00.00");
        }else{
            this.deposit = deposit;
            this.balance += this.deposit;
        }
    }
    public void setWithdraw(double withdraw){
        if (withdraw <= 0){
            System.out.println("Sorry, to withdraw from your account, it has to be a value greater than zero (0)!!");
        }else{
            withdraw += 5;
            balance -= withdraw;
        }
    }
    public void info(){
        System.out.println(getHolder() + "'s information account:");
        System.out.printf("Balance: %.2f$\n", getBalance());
        System.out.println("Account Number: " + getAccountNumber());
    }
}
