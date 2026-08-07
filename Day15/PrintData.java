
class Printer {

    void print(int number) {
        System.out.println("Integer : " + number);
    }

    void print(double number) {
        System.out.println("Double : " + number);
    }

    void print(String text) {
        System.out.println("String : " + text);
    }

}

public class PrintData {

    public static void main(String[] args) {
        Printer p = new Printer();

        p.print(100);
        p.print(99.99);
        p.print("Hello Java");

    }
}
