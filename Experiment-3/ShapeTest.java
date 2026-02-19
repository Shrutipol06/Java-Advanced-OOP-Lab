// Abstract class
abstract class Shape {
    double dim1, dim2;

    Shape(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    abstract double area();
}

// Rectangle class
class Rectangle extends Shape {
    Rectangle(double l, double b) {
        super(l, b);
    }

    double area() {
        return dim1 * dim2;
    }
}

// Triangle class
class Triangle extends Shape {
    Triangle(double b, double h) {
        super(b, h);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

// Main class
public class ShapeTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        Triangle t = new Triangle(6, 3);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Triangle Area: " + t.area());
    }
}
