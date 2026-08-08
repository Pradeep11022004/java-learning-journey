abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void displayName() {
        System.out.println("Employee Name : " + name);
    }
}

class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    double hours;
    double hourlyRate;

    PartTimeEmployee(String name, double hours, double hourlyRate) {
        super(name);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hours * hourlyRate;
    }
}

public class EmployeeSalary {

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Pradeep", 50000.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Rahul", 100, 120);

        fullTimeEmployee.displayName();
        System.out.println("Salary : " + fullTimeEmployee.calculateSalary());

        System.out.println();

        partTimeEmployee.displayName();
        System.out.println("Salary : " + partTimeEmployee.calculateSalary());
    }
}