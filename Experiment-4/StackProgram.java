// Interface
interface Stack {
    void push(int data);
    void pop();
    void display();
    void overflow();
    void underflow();
}

// Implementation class
class IntegerStack implements Stack {
    int arr[];
    int top = -1;
    int size;

    IntegerStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int data) {
        if (top == size - 1)
            overflow();
        else {
            arr[++top] = data;
            System.out.println("Inserted: " + data);
        }
    }

    public void pop() {
        if (top == -1)
            underflow();
        else
            System.out.println("Deleted: " + arr[top--]);
    }

    public void display() {
        if (top == -1)
            System.out.println("Stack Empty");
        else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--)
                System.out.println(arr[i]);
        }
    }

    public void overflow() {
        System.out.println("Stack Overflow");
    }

    public void underflow() {
        System.out.println("Stack Underflow");
    }
}

// Main class
public class StackProgram {
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack(3);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        s.pop();
        s.display();
    }
}
