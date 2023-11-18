package BankAccount;

import java.util.Scanner;

public class Display {
    Scanner sc = new Scanner(System.in);

    public Display(){

    }
    public void welcome(){
        System.out.println("Welcome to FacadeBank!\nYes that is our name and yes, WE ARE LEGIT.");
    }
    public int menu(){
        System.out.println("\n-------------\nAvailable Transactions: ");
        System.out.println("1: Deposit\n2: Withdraw\n3: Check Account Balance\n");
        System.out.print("Enter Choice: ");
        return sc.nextInt();
    }

    public int askAccountNumber(){
        System.out.print("\nEnter account number: ");
        return sc.nextInt();
    }

    public int askPIN(){
        System.out.print("Enter PIN: ");
        return sc.nextInt();
    }
    public void thankYou(){
        System.out.println("\n\nThank you for using FacadeBank!\nYour #1 Trusted Bank");
    }
}
