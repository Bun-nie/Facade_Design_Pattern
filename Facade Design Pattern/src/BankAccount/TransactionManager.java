package BankAccount;

import java.util.Scanner;

public class TransactionManager {
    Scanner sc = new Scanner(System.in);
    BalanceChecker balanceChecker = new BalanceChecker();
    Display display = new Display();
    private int option;
    private char c = 'Y';

    public TransactionManager() {
    }

    public void transuck(){
        do {
            option = display.menu();
            switch (option) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                default:
                    System.out.println("Not a valid option.");
                    break;
            }
            System.out.print("Would you like to do another transaction? [Y/N]: ");
            c = sc.next().charAt(0);
        } while (c != 'N');
        display.thankYou();
    }

    public void deposit(){
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        balanceChecker.add(amount);
        System.out.println("Deposit Successful. Current Balance: " + balanceChecker.getBalance());
    }

    public void withdraw(){
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        if(balanceChecker.getBalance() > (int) amount){
            balanceChecker.deduct(amount);
            System.out.println("Deposit Successful. Current Balance: " + balanceChecker.getBalance());
        } else {
            System.out.println("Deposit Unsuccessful. Not enough money on account. Current Balance: " + balanceChecker.getBalance());
        }
    }

    public void checkBalance(){
        if(balanceChecker.notYetBroke()){
            System.out.println("Still surviving! Current Balance: " + balanceChecker.getBalance());
        } else {
            System.out.println("Broke Ass Bitch! Current Balance: " + balanceChecker.getBalance());
        }
    }
}
