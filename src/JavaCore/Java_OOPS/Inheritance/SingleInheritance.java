package JavaCore.Java_OOPS.Inheritance;

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {

        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}


//generate all possible question on inheritance in java
// 1. What is inheritance in Java?
// answer: Inheritance is a fundamental concept in object-oriented programming that allows a new class (child class) to inherit
// 2. Explain the concept of single inheritance in Java.
// 3. How does single inheritance differ from multiple inheritance in Java?
// answer: Single inheritance allows a class to inherit from only one parent class, while multiple inheritance allows a class to inherit from multiple parent classes.
// Java does not support multiple inheritance with classes to avoid ambiguity, but it can be achieved using interfaces.
// 4. What are the advantages of using inheritance in Java?
// answer: Inheritance promotes code reusability, allows for method overriding, and establishes a hierarchical relationship between classes, making it easier to manage and extend code.
// 5. Can you provide an example of single inheritance in Java?
// 6. What is the purpose of the `super` keyword in inheritance?
// answer: The `super` keyword is used to refer to the parent class and can be used to access parent class methods and constructors from the child class.
// 7. How can you call a parent class method from a child class in Java?
// answer: You can call a parent class method from a child class using the `super` keyword followed by the method name, like `super.methodName();`.
// 8. What happens if a child class overrides a method from its parent class?
// 9. Can a child class access private members of its parent class in Java?
// answer: No, a child class cannot directly access private members of its parent class. However, it can access them through public or protected methods provided by the parent class.
// 10. How can you achieve method overriding in Java inheritance?
// 11. What is the difference between method overloading and method overriding in Java?
// answer: Method overloading occurs when multiple methods in the same class have the same name but different parameters,
// while method overriding occurs when a child class provides a specific implementation of a method that is already defined in its parent class.
// 12. Can a child class have multiple parent classes in Java?
// 13. What is the purpose of the `extends` keyword in Java inheritance?
// 15. What is the role of constructors in inheritance in Java?
// 16. Can a child class call the constructor of its parent class in Java?
// 17. How can you prevent a class from being inherited in Java?
// answer: You can prevent a class from being inherited by declaring it as `final`. A `final` class cannot be subclassed, meaning no other class can extend it.
// 18. What is the difference between `final` class and `final` method in Java inheritance?
// answer: A `final` class cannot be subclassed, meaning no other class can extend it, while a `final` method cannot be overridden by subclasses.
// 19. How can you implement polymorphism using inheritance in Java?
// 20. What is the significance of the `Object` class in Java inheritance?
