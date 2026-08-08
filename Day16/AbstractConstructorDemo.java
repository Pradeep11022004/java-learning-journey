abstract class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor Called");
    }

    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    abstract void work();
}

class Employee extends Person {

    Employee(String name, int age) {
        super(name, age);
    }

    @Override
    void work() {
        System.out.println("Employee is working.");
    }
}

public class AbstractConstructorDemo {

    public static void main(String[] args) {
        Employee employee = new Employee("Pradeep", 21);

        employee.displayPerson();
        employee.work();
    }
}