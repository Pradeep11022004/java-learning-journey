class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Employee {

    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Initial Balance cannot be negative.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdraw Amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
        }
    }

    public void displayAccount() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        // ---- Student ----
        Student student = new Student();
        student.setName("Pradeep");
        student.setAge(21);

        System.out.println("Student Name : " + student.getName());
        System.out.println("Student Age : " + student.getAge());
        System.out.println();

        // ---- Employee ----
        Employee employee = new Employee();
        employee.setId(1001);
        employee.setName("Ravi Kumar");
        employee.setSalary(55000.0);

        System.out.println("Employee ID : " + employee.getId());
        System.out.println("Employee Name : " + employee.getName());
        System.out.println("Employee Salary : " + employee.getSalary());
        System.out.println();

        // ---- BankAccount ----
        BankAccount account = new BankAccount();
        account.setAccountNumber("ACC101");
        account.setAccountHolder("Pradeep");
        account.setBalance(5000);

        account.deposit(1000);
        account.withdraw(500);

        System.out.println("Final Account Details:");
        account.displayAccount();
    }
}