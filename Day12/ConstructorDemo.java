public class ConstructorDemo {

    public static void main(String[] args) {
        // Constructor call - this is where Student() actually runs
        Student s1 = new Student();
        s1.display();
    }
}

class Student {

    String name;
    int age;

  
    Student() {
        name = "Pradeep";
        age = 22;
      
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}