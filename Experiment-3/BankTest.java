// Base class
class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    // Override withdraw method
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Minimum balance must be 100.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        }
    }
}

// Main class
public class BankTest {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(500);

        s.deposit(200);
        s.withdraw(300);
        s.withdraw(400);
    }
}
