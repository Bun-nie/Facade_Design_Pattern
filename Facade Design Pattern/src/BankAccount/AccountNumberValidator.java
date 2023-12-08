package BankAccount;
public class AccountNumberValidator {
    private final int accountNumber = 123456789;
    public boolean validateAccount(int account){
        return account == accountNumber;
    }
}
