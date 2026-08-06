
class Shape {

    void draw() {
        System.out.println("Drawing a Shape.");
    }
}

class Circle extends Shape {

    void displayCircle() {
        System.out.println("Drawing a Circle");
    }
}

public class ShapeCircle {

    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.draw();
        circle.displayCircle();

    }
}
