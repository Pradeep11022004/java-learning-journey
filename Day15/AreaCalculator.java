
public class AreaCalculator {

    double area(double side) {
        return side * side;
    }

    double area(double length, double width) {
        return length * width;
    }

    double area(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        AreaCalculator ac = new AreaCalculator();

        System.out.println("Square Area :" + ac.area(5));
        System.out.println("Rectangle Area :" + ac.area(10, 5));
        System.out.println("Circle Area :" + ac.area(7, true));

    }
}
