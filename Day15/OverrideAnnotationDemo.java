class Person {
    void display() {
        System.out.println("This is Person.");
    }
}

class Student extends Person {
    @Override
    void display() {
        System.out.println("This is Student.");
    }
}

public class OverrideAnnotationDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}