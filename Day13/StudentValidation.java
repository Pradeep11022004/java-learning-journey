public class StudentValidation {

    private int rollNo;
    private String name;
    private int age;
    private double cgpa;

    public void setRollNo(int rollNo) {
        if (rollNo > 0) {
            this.rollNo = rollNo;
        } else {
            System.out.println("Roll No must be greater than 0.");
        }
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            System.out.println("Name cannot be empty.");
        }
    }

    public void setAge(int age) {
        if (age >= 5 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Age must be between 5 and 120.");
        }
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("CGPA must be between 0 and 10.");
        }
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void displayStudent() {
        System.out.println("Roll No : " + getRollNo());
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("CGPA : " + getCgpa());
    }

    public static void main(String[] args) {

        StudentValidation student = new StudentValidation();
        student.setRollNo(101);
        student.setName("Pradeep");
        student.setAge(21);
        student.setCgpa(8.7);

        student.displayStudent();
    }
}