import java.util.Scanner;

class Area {

    // instance variables
    double length;
    double breadth;

    // method to set dimensions
    void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    // method to calculate area
    double getArea() {
        return length * breadth;
    }
}

// Main class
public class AreaTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object of Area
        Area rect = new Area();

        // Take input from user
        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        // Set dimensions
        rect.setDim(l, b);

        // Display area
        System.out.println("Area of Rectangle: " + rect.getArea());

        sc.close();
    }
}

