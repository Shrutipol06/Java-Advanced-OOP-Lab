// Base class
class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String n, String a, double s, String j) {
        name = n;
        address = a;
        salary = s;
        jobTitle = j;
    }

    void calculateBonus() {
        System.out.println("Bonus: " + (salary * 0.10));
    }

    void performanceReport() {
        System.out.println(name + " performance is good.");
    }

    void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

// Subclasses
class Manager extends Employee {
    Manager(String n, String a, double s, String j) {
        super(n, a, s, j);
    }
}

class Developer extends Employee {
    Developer(String n, String a, double s, String j) {
        super(n, a, s, j);
    }
}

class Programmer extends Employee {
    Programmer(String n, String a, double s, String j) {
        super(n, a, s, j);
    }
}

// Main class
public class CompanyTest {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul", "Pune", 50000, "Manager");
        Developer d = new Developer("Anita", "Mumbai", 40000, "Developer");

        m.calculateBonus();
        d.performanceReport();
        m.manageProject();
    }
}
