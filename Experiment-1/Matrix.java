import java.util.Scanner;

class Matrix {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        int ch;

        // Input Matrix A
        System.out.println("Enter matrix A:");
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                a[i][j] = sc.nextInt();

        // Input Matrix B
        System.out.println("Enter matrix B:");
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                b[i][j] = sc.nextInt();

        // Display Matrix A
        System.out.println("\nMatrix A:");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }

        // Display Matrix B
        System.out.println("\nMatrix B:");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }

        // Menu using do-while
        do {
            System.out.println("\nMENU");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Transpose of A");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch) {

                case 1:   // Addition
                    System.out.println("Result (Addition):");
                    for(int i=0;i<2;i++) {
                        for(int j=0;j<2;j++) {
                            c[i][j] = a[i][j] + b[i][j];
                            System.out.print(c[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:   // Multiplication
                    System.out.println("Result (Multiplication):");
                    for(int i=0;i<2;i++) {
                        for(int j=0;j<2;j++) {
                            c[i][j] = 0;
                            for(int k=0;k<2;k++)
                                c[i][j] += a[i][k] * b[k][j];
                            System.out.print(c[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:   // Transpose of A
                    System.out.println("Result (Transpose of A):");
                    for(int i=0;i<2;i++)
                        for(int j=0;j<2;j++)
                            c[j][i] = a[i][j];

                    for(int i=0;i<2;i++) {
                        for(int j=0;j<2;j++)
                            System.out.print(c[i][j] + " ");
                        System.out.println();
                    }
                     System.out.println("Result (Transpose of B):");
                    for(int i=0;i<2;i++)
                        for(int j=0;j<2;j++)
                            c[j][i] = b[i][j];

                    for(int i=0;i<2;i++) {
                        for(int j=0;j<2;j++)
                            System.out.print(c[i][j] + " ");
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(ch != 4);
        System.out.println("Operation end");

        sc.close();
    }
}
