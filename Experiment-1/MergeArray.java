import java.util.Scanner;

class MergeArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[3];
        int b[] = new int[3];
        int c[] = new int[6];

        System.out.println("Enter 3 sorted elements for first array:");
        for(int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter 3 sorted elements for second array:");
        for(int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        int i = 0, j = 0, k = 0;

        while(i < 3 && j < 3) {
            if(a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < 3) {
            c[k] = a[i];
            i++;
            k++;
        }

        while(j < 3) {
            c[k] = b[j];
            j++;
            k++;
        }

        System.out.println("Merged Array:");
        for(int m = 0; m < 6; m++) {
            System.out.print(c[m] + " ");
        }

        sc.close();
    }
}
