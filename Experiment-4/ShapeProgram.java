// Interface
interface Shape {
    void area();
}

// Rectangle class
class Rectangle implements Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

// Triangle class
class Triangle implements Shape {
    int base, height;

    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    public void area() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

// Main class
public class ShapeProgram {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(6, 4);

        r.area();
        t.area();
    }
}

