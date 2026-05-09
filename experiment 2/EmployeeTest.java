class Employee {

    
    private String firstName;
    private String lastName;
    private double monthlySalary;

    
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }
}


public class EmployeeTest {

    public static void main(String[] args) {

        
        Employee e1 = new Employee("Rahul", "Sharma", 30000);
        Employee e2 = new Employee("Anita", "Patel", 40000);

        
        System.out.println("Before Raise:");

        System.out.println(e1.getFirstName() + " Yearly Salary: " + e1.getMonthlySalary() * 12);
        System.out.println(e2.getFirstName() + " Yearly Salary: " + e2.getMonthlySalary() * 12);

        
        e1.setMonthlySalary(e1.getMonthlySalary() * 1.10);
        e2.setMonthlySalary(e2.getMonthlySalary() * 1.10);

        
        System.out.println("\nAfter 10% Raise:");

        System.out.println(e1.getFirstName() + " Yearly Salary: " + e1.getMonthlySalary() * 12);
        System.out.println(e2.getFirstName() + " Yearly Salary: " + e2.getMonthlySalary() * 12);
    }
}

