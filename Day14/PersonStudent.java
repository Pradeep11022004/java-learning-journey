
class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
    }

}

class Student extends Person {

    int rollNo;

    public Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    void displayStudent() {

        System.out.println("Student RollNumber : " + rollNo);
    }
}

public class PersonStudent {

    public static void main(String[] args) {

        Student student = new Student("Pradeep.K", 21, 10436);

        student.displayPerson();

        student.displayStudent();

    }
}
