
class Employee {

    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayEmployee() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name :" + name);
    }
}

class Manager extends Employee {

    String department;

    public Manager(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    void displayManager() {
        System.out.println("Department : " + department);
    }
}

public class EmployeeManager {

    public static void main(String[] args) {

        Manager manager = new Manager(101, "Pradeep", "Software Development");

        manager.displayEmployee();
        manager.displayManager();

    }
}
