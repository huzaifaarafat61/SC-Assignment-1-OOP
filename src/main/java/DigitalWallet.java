public class DigitalWallet {

    private String accountHolder;
    private double balance;
    private String pinCode;

    public DigitalWallet(String accountHolder, double balance, String pinCode) {
        this.accountHolder = accountHolder;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }

        this.pinCode = pinCode;
    }

    public boolean withdraw(double amount, String enteredPin) {

        if (!pinCode.equals(enteredPin)) {
            return false;
        }

        if (amount <= 0 || amount > balance) {
            return false;
        }

        balance = balance - amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}