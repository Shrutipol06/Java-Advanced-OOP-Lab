class StaticDemo {

    
    static int count;

    
    static {
        System.out.println("Static Block Executed");
        count = 10;
    }

    
    static void display() {
        System.out.println("Value of count: " + count);
    }

    
    public static void main(String[] args) {

        System.out.println("Main Method Started");

        
        display();

        
        System.out.println("Changing the count");
        count = 20;

        display();
    }
}

