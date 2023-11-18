package BankAccount;

public class BalanceChecker {
    private double balance = 1000;

    public BalanceChecker() {
    }

    public double getBalance(){
        return balance;
    }

    public boolean notYetBroke(){
        return getBalance() > 0;
    }
    public void add(double amount){
        balance += amount;
    }
    public void deduct(double amount){
        balance -= amount;
    }
}
