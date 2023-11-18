package BankAccount;

public class Client {
    public static void main(String[] args) {
        Display display = new Display();
        display.welcome();
        BankAccountFacade facade = new BankAccountFacade(display.askAccountNumber(), display.askPIN());
        facade.doTransaction();
    }
}
