import java.util.Scanner;

class Stack {
    int top = -1;
    int size = 5;
    int arr[] = new int[size];

    void push(int x) {
        if (top == size - 1)
            System.out.println("Stack Overflow");
        else {
            arr[++top] = x;
            System.out.println(x + " pushed");
        }
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println(arr[top--] + " popped");
    }

    void display() {
        if (top == -1)
            System.out.println("Stack Empty");
        else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

class Queue {
    int front = 0, rear = -1;
    int size = 5;
    int arr[] = new int[size];

    void enqueue(int x) {
        if (rear == size - 1)
            System.out.println("Queue Full");
        else {
            arr[++rear] = x;
            System.out.println(x + " inserted");
        }
    }

    void dequeue() {
        if (front > rear)
            System.out.println("Queue Empty");
        else
            System.out.println(arr[front++] + " removed");
    }

    void display() {
        if (front > rear)
            System.out.println("Queue Empty");
        else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

public class StackQueueDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        Queue q = new Queue();

        int mainChoice, choice, value;

        do {
            System.out.println("\n1.Stack");
            System.out.println("2.Queue");
            System.out.println("3.Exit");
            System.out.print("Choose: ");

            mainChoice = sc.nextInt();

            switch (mainChoice) {

                case 1: // STACK MENU
                    do {
                        System.out.println("\n--- STACK MENU ---");
                        System.out.println("1.Push");
                        System.out.println("2.Pop");
                        System.out.println("3.Display");
                        System.out.println("4.Back");
                        System.out.print("Enter choice: ");

                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.print("Enter value: ");
                                value = sc.nextInt();
                                s.push(value);
                                break;
                            case 2:
                                s.pop();
                                break;
                            case 3:
                                s.display();
                                break;
                        }
                    } while (choice != 4);
                    break;

                case 2: // QUEUE MENU
                    do {
                        System.out.println("\n--- QUEUE MENU ---");
                        System.out.println("1.Enqueue");
                        System.out.println("2.Dequeue");
                        System.out.println("3.Display");
                        System.out.println("4.Back");
                        System.out.print("Enter choice: ");

                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.print("Enter value: ");
                                value = sc.nextInt();
                                q.enqueue(value);
                                break;
                            case 2:
                                q.dequeue();
                                break;
                            case 3:
                                q.display();
                                break;
                        }
                    } while (choice != 4);
                    break;

                case 3:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (mainChoice != 3);

        sc.close();
    }
}
