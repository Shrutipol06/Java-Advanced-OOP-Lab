// Parent class
class Student {
    int roll_no;

    void setRoll(int r) {
        roll_no = r;
    }

    void displayRoll() {
        System.out.println("Roll No: " + roll_no);
    }
}

// Child class
class Test extends Student {
    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void displayMarks() {
        System.out.println("Marks in Subject1: " + sub1);
        System.out.println("Marks in Subject2: " + sub2);
    }
}

// Grandchild class
class Result extends Test {
    void displayResult() {
        int total = sub1 + sub2;
        System.out.println("Total Marks: " + total);
    }
}

// Main class
public class StudentTest {
    public static void main(String[] args) {
        Result r = new Result();

        r.setRoll(101);
        r.setMarks(80, 90);

        r.displayRoll();
        r.displayMarks();
        r.displayResult();
    }
}
