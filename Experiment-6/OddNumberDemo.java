import java.util.Scanner;

// Custom Exception
class OddNumberException extends Exception {
    OddNumberException(String msg) {
        super(msg);
    }
}

public class OddNumberDemo {

    static void checkNumber(int num) throws OddNumberException {
        if (num % 2 != 0)
            throw new OddNumberException("Number is odd");
        else
            System.out.println("Number is even");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            checkNumber(n);
        }
        catch (OddNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}