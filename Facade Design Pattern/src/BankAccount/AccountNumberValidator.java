package BankAccount;

public class AccountNumberValidator {
    private final int accountNumber = 123456789;

    public AccountNumberValidator() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean validateAccount(int account){
        return account == accountNumber;
    }
}
