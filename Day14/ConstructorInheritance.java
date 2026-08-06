
class Animal {

    Animal() {
        System.out.println("Animal Constructor Called");
    }

}

class Dog extends Animal {

    Dog() {

        System.out.println("Dog Constructor Called");
    }

}

public class ConstructorInheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();

    }
}
