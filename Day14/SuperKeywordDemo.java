
class Person {

    void display() {
        System.out.println("This is the Person class.");
    }
}

class Student extends Person {

    void display() {
        super.display();
        System.out.println("This is the Student class.");
    }
}

public class SuperKeywordDemo {

    public static void main(String[] args) {
        Student student = new Student();
        student.display();

    }
}
