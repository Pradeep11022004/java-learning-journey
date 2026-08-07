
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

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows.");

    }
}

public class AnimalSound {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();

        cat.sound();

    }
}
