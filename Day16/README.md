# Day 16 - Abstraction

## Overview

Today I learned **Abstraction** in Java and practiced it using abstract classes and abstract methods.

Abstraction means **hiding implementation details and showing only the required functionality**.

## Topics Covered

- Abstract Class
- Abstract Method
- Concrete Class
- Abstract Class Constructor
- Normal Methods inside Abstract Class
- Abstract Class with Multiple Child Classes
- Abstract Reference
- Runtime Polymorphism with Abstract Classes
- Template Method Pattern
- Real-World Abstraction
- Abstraction with Encapsulation
- Abstraction with Inheritance
- Abstraction with Polymorphism

## Programs

1. `AbstractClassDemo.java`
   - Basic abstract class and abstract method.

2. `ShapeArea.java`
   - Abstract class with multiple child classes.
   - Circle and Rectangle calculate their own areas.

3. `EmployeeSalary.java`
   - Abstract employee class.
   - Full-time and part-time salary calculation.

4. `VehicleStart.java`
   - Abstract method and normal method inside an abstract class.

5. `BankAccountAbstract.java`
   - Abstraction combined with encapsulation.
   - Private balance with controlled access.

6. `AbstractConstructorDemo.java`
   - Constructor execution in an abstract parent class.
   - Constructor chaining using `super()`.

7. `AbstractReferenceDemo.java`
   - Abstract reference pointing to different child objects.
   - Runtime polymorphism.

8. `TemplateMethodDemo.java`
   - Parent class controls a common workflow.
   - Child classes provide specific implementations.

9. `AbstractRealWorldDemo.java`
   - Real-world payment abstraction.
   - UPI and Card payment implementations.

10. `AbstractionDemo.java`
    - Combines abstraction, inheritance, method overriding, and runtime polymorphism.

## Important Concepts

### Abstract Class

An abstract class is a class that cannot be instantiated directly.

```java
abstract class Animal {
    abstract void sound();
}
```

### Abstract Method

An abstract method does not have a body.

```java
abstract void sound();
```

The child class must provide the implementation.

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}
```

### Abstract Class Can Have Normal Methods

An abstract class can contain both abstract and normal methods.

```java
abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}
```

The child must implement `start()`, but can directly inherit `stop()`.

### Abstract Class Constructor

An abstract class can have a constructor.

The constructor executes when a concrete child object is created.

```text
Child object creation
        ↓
Parent constructor
        ↓
Child constructor
```

### Abstract Reference

An abstract class reference can point to a child object.

```java
Animal animal;

animal = new Dog();
animal.sound();

animal = new Cat();
animal.sound();
```

This combines **abstraction with runtime polymorphism**.

## Key Difference

### Encapsulation

Hides and protects data.

```java
private double balance;
```

### Abstraction

Hides implementation details and exposes required behavior.

```java
abstract void calculateSalary();
```

## Learning Outcome

After completing Day 16, I understand:

- What abstraction means.
- Why abstract classes are used.
- Why abstract classes cannot be instantiated.
- How abstract methods work.
- How child classes implement abstract methods.
- How constructors work in abstract classes.
- How normal methods can exist inside abstract classes.
- How abstract references work.
- How abstraction and runtime polymorphism work together.
- How abstraction can represent real-world systems.

---

## Day 16 Progress

| Program | Status |
|---------|--------|
| AbstractClassDemo.java | ✅ |
| ShapeArea.java | ✅ |
| EmployeeSalary.java | ✅ |
| VehicleStart.java | ✅ |
| BankAccountAbstract.java | ✅ |
| AbstractConstructorDemo.java | ✅ |
| AbstractReferenceDemo.java | ✅ |
| TemplateMethodDemo.java | ✅ |
| AbstractRealWorldDemo.java | ✅ |
| AbstractionDemo.java | ✅ |

**10/10 Programs Completed**

---

## Previous OOP Topics

- Day 13 - Encapsulation
- Day 14 - Inheritance
- Day 15 - Polymorphism
- Day 16 - Abstraction

## Next

**Day 17 - Interfaces**

---

Author: **Pradeep K**