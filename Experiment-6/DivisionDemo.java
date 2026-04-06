import java.util.Scanner;

// Custom Exception
class DivisionException extends Exception {
    DivisionException(String msg) {
        super(msg);
    }
}

// Calculator Class
class Calculator {
    int divide(int a, int b) throws DivisionException {
        if (b == 0)
            throw new DivisionException("Cannot divide by zero");

        return a / b;
    }
}

// Main Class
public class DivisionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = c.divide(a, b);
            System.out.println("Result: " + result);
        }
        catch (DivisionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}