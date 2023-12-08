package BankAccount;
public class Client {
    public static void main(String[] args) {
        BankAccountFacade facade = new BankAccountFacade();
        facade.doTransaction();
    }
}
