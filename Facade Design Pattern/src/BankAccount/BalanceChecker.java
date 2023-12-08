package BankAccount;
public class BalanceChecker {
    private double balance = 0;
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
