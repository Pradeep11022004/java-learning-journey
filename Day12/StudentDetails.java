
public class StudentDetails {

    String name;
    int id;
    int age;

    void displayStudentInfo() {
        System.out.println("Student Name : " +this. name);
        System.out.println("Student ID :" + this.id);
        System.out.println("Student Age :" + this.age);

    }

    public static void main(String[] args) {

        StudentDetails student1 = new StudentDetails();

        student1.name = "Pradeep";
        student1.id = 101;
        student1.age = 21;

        StudentDetails student2 = new StudentDetails();

        student2.name = "Pragadeesh";
        student2.id = 102;
        student2.age = 22;

        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();

        

    }
}
