import java.util.Scanner;
import java.util.Arrays;

public class SortNames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String names[] = new String[10];

        // Input 10 names
        System.out.println("Enter 10 names:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Sort names alphabetically
        Arrays.sort(names);

        // Display sorted names
        System.out.println("\nNames in Alphabetical Order:");

        for (int i = 0; i < 10; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}
