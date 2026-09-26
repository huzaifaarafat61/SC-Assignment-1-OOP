public class Main {

    public static void main(String[] args) {

        DigitalWallet wallet =
                new DigitalWallet("Ali", 5000, "1234");

        System.out.println("Initial Balance: " + wallet.getBalance());

        boolean result1 = wallet.withdraw(1000, "1234");

        System.out.println("Withdrawal successful: " + result1);
        System.out.println("Remaining Balance: " + wallet.getBalance());

        boolean result2 = wallet.withdraw(1000, "9999");

        System.out.println("Withdrawal successful: " + result2);
        System.out.println("Remaining Balance: " + wallet.getBalance());
    }
}