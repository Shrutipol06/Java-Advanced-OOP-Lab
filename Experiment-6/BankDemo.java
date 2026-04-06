import java.util.Scanner;

// Custom Exception for Low Balance
class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}

// Custom Exception for Negative Number
class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

// BankAccount Class
class BankAccount {
    double balance = 1000;

    void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double amount) throws NegativeNumberException {
        if (amount < 0)
            throw new NegativeNumberException("Cannot deposit negative amount");

        balance += amount;
        System.out.println("Amount deposited successfully");
    }

    void withdraw(double amount) throws NegativeNumberException, LowBalanceException {
        if (amount < 0)
            throw new NegativeNumberException("Cannot withdraw negative amount");

        if (amount > balance)
            throw new LowBalanceException("Insufficient balance");

        balance -= amount;
        System.out.println("Amount withdrawn successfully");
    }
}

// Main Class
public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        try {
            b.balanceEnquiry();

            System.out.print("Enter deposit amount: ");
            double d = sc.nextDouble();
            b.deposit(d);

            System.out.print("Enter withdraw amount: ");
            double w = sc.nextDouble();
            b.withdraw(w);

            b.balanceEnquiry();
        }
        catch (NegativeNumberException | LowBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}