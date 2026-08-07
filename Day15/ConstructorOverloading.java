
class Student {

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name) {
        System.out.println("Student Name : " + name);
    }

    Student(String name, int age) {
        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
    }

}

public class ConstructorOverloading {

    public static void main(String[] args) {
        new Student();

        new Student("Pradeep");

        new Student("Pradeep", 21);

    }
}
