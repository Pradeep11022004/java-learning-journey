abstract class Shape {

    abstract double calculateArea();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class ShapeArea {

    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println("Circle Area : " + circle.calculateArea());
        System.out.println("Rectangle Area : " + rectangle.calculateArea());
    }
}