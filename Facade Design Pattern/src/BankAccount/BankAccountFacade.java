package BankAccount;
public class BankAccountFacade {
    private AccountNumberValidator accountNumberValidator = new AccountNumberValidator();
    private PINValidator pinValidator = new PINValidator();
    private TransactionManager transaction = new TransactionManager();
    private Display display = new Display();

    private int accountNumber;
    private int pin;

    public BankAccountFacade(int accountNumber, int pin){
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public void doTransaction(){
        if(accountNumberValidator.validateAccount(this.accountNumber) && pinValidator.validatePin(this.pin)){
            transaction.transuck();
        } else {
            System.out.println("Incorrect Credentials!");
        }
    }
}