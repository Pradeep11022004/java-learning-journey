public class Student{

    String name ="Pradeep";
    int age =21;

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args) {
        
        Student student = new Student();
        student.display();
    }
}