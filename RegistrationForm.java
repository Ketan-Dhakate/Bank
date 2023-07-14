import java.util.Scanner;

public class RegistrationForm {
    private Bank bank;
    private Scanner scanner;

    public RegistrationForm(Bank bank) {
        this.bank = bank;
        this.scanner = new Scanner(System.in);
    }

    public void displayForm() {
        System.out.println("=== User Registration ===");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your contact information: ");
        String contactInformation = scanner.nextLine();

        System.out.print("Enter your initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();

        // Generate a unique account number (You may need a more robust mechanism in a real system)
        int accountNumber = generateAccountNumber();

        // Create a new User object
        User user = new User(name, address, contactInformation, accountNumber, initialDeposit);

        // Add the user to the bank's records
        bank.addUser(user);

        System.out.println("Registration successful!");
        System.out.println("Your account number is: " + accountNumber);
    }

    private int generateAccountNumber() {
        // Generate a random account number or use a more sophisticated mechanism
        return (int) (Math.random() * 10000);
    }
}
