package BankAccount;
public class PINValidator {
    private final int PIN = 1234;
    public boolean validatePin(int pin){
        return pin == PIN;
    }
}
