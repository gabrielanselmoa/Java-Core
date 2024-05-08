package course.composition.q4.model.entities;

import course.composition.q4.model.exceptions.DomainException;

public class Bank {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Bank() {
    }

    public Bank(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) throws DomainException{
        if (amount <= 0){
            System.out.println("Exception");
            throw new DomainException("This value does not match with a deposit!");
        }
        balance += amount;
    }
    // Spreading exception to be treated
    public void withdraw(double amount) throws DomainException{
        if (amount > withdrawLimit){
            //System.out.println("Exception");
            throw new DomainException("Withdraw Error: Exceeds the withdraw limit!");
        }
        if (amount > balance){
            throw new DomainException("Withdraw Error: Not Enough Balance!");
        }
        balance -= amount;
    }
}

//Right way to treat an Exception:
    // - Put all verification on the Class that will operate this logic
    // - Personalize my Exceptions and use TryCatch on Main Class
    // - Treat all Exceptions
