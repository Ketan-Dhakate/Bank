import transation.Transaction;

public class AccountStatement {
    private Bank bank;

    public AccountStatement(Bank bank) {
        this.bank = bank;
    }

    public void displayStatement(int accountNumber) {
        User user = bank.getUserByAccountNumber(accountNumber);

        if (user == null) {
            System.out.println("Invalid account number!");
            return;
        }

        System.out.println("=== Account Statement ===");
        System.out.println("Account Holder: " + user.getName());
        System.out.println("Account Number: " + user.getAccountNumber());
        System.out.println("Account Balance: " + user.getAccountBalance());
        System.out.println("--- Transaction History ---");
        System.out.println("Date\t\tAmount\t\tRemaining Balance");

        // Access transaction records (You may need to implement a transaction history in the User class)
        // Here, we assume the User class has a List<Transaction> field called "transactionHistory"

    }
}
