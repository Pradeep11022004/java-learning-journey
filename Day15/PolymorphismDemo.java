class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition of Integers : " + calc.add(10, 20));
        System.out.println("Addition of Doubles : " + calc.add(10.5, 20.5));

        Dog dog = new Dog();
        dog.sound();
    }
}
