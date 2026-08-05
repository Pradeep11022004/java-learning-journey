
public class Circle {

    private double radius;

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid Radius.");
        }
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {

        return Math.PI * radius * radius;

    }

    public static void main(String[] args) {

        Circle c = new Circle();
      

        c.setRadius(7.0);
        System.out.println("Radius : " + c.getRadius());

        System.out.println("Area : " + c.calculateArea());

        System.out.println("Confirmed Radius: " + c.getRadius());

    }
}
