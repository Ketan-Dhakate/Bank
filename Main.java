public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        PasswordAuthentication passwordAuthentication = new PasswordAuthentication();
        UserInterface userInterface = new UserInterface(bank, passwordAuthentication);
        userInterface.start();
    }
}

