abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Employee Name : " + name);
    }

    abstract double calculateSalary();
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

public class AbstractionDemo {

    public static void main(String[] args) {
        Employee employee;

        employee = new FullTimeEmployee("Pradeep", 50000.0);
        employee.displayName();
        System.out.println("Salary : " + employee.calculateSalary());

        System.out.println();

        employee = new PartTimeEmployee("Rahul", 100, 120);
        employee.displayName();
        System.out.println("Salary : " + employee.calculateSalary());
    }
}