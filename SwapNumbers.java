class SwapNumbers {
    public static void main(String args[]) {

        int a = 10;
        int b = 20;
        int temp;
         System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap");
        

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
