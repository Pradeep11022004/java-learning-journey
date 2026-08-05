
public class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <=120) {
            this.age = age;
        }else{
            System.out.println("Invalid Age");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Pradeep");
        student.setAge(20);
       

        System.out.println(student.getName());
        System.out.println(student.getAge());

    }
}
