class StaticDemo {

    
    static int count;

    
    static {
        System.out.println("Static Block Executed");
        count = 10;
    }

    // Static method
    static void display() {
        System.out.println("Value of count: " + count);
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("Main Method Started");

        // Calling static method
        display();

        // Changing static variable
        System.out.println("Changing the count");
        count = 20;

        display();
    }
}

