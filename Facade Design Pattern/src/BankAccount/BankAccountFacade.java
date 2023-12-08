package BankAccount;
public class BankAccountFacade {
    private AccountNumberValidator accountNumberValidator = new AccountNumberValidator();
    private PINValidator pinValidator = new PINValidator();
    private TransactionManager transaction = new TransactionManager();
    private Display display = new Display();
    public void doTransaction(){
        if(accountNumberValidator.validateAccount(display.askAccountNumber()) && pinValidator.validatePin(display.askPIN())){
            transaction.transuck();
        } else {
            display.invalid();
        }
    }
}
