import java.util.HashMap;
import java.util.Map;



public class Bank {
    private Map<Integer, User> users;

    public Bank() {
        this.users = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getAccountNumber(), user);
    }

    public User getUserByAccountNumber(int accountNumber) {
        return users.get(accountNumber);
    }

    public void updateUser(User user) {
        users.put(user.getAccountNumber(), user);
    }
}
