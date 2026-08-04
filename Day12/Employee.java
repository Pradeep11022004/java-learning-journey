public class Employee{
    int id = 101;
    String name = "Jack Reacher";
    double salary = 50000.0;

    void displayEmployee(){
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Salary : "+salary);
    }
    public static void main(String[] args) {

        Employee emp =new Employee();
        emp.displayEmployee();

        
    }
}