import java.net.PasswordAuthentication;
import java.util.Scanner;

public class User {
    private String name;
    private String address;
    private String contactInformation;
    private int accountNumber;
    private double accountBalance;

    // Constructor
    public User(String name, String address, String contactInformation, int accountNumber, double accountBalance) {
        this.name = name;
        this.address = address;
        this.contactInformation = contactInformation;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}



