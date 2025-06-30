package JavaCore.Java_OOPS.Abstraction;


abstract class Animal{

    // Abstract method (no body)
    abstract void eat();

    // Concrete method(has body)
    void display(){
        System.out.println("Display Abstract Class");
    }
}

class Dog extends Animal{

    // Implementing the abstract method
    @Override
    void eat(){
       System.out.println("Dog is Eating");
    }
}
public class AbstractClass {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.eat();     //Calls implemented method
        dog.display(); //Calls inherited concrete method
    }
}

// generate all possible questions on abstraction in java
// 1. What is abstraction in Java?
// answer: Abstraction in Java is a fundamental OOP concept that focuses on hiding the complex implementation details and showing only the essential features of an object.
// It allows developers to work with objects at a higher level without needing to understand the intricate workings behind them.
// 2. How do you achieve abstraction in Java?
// answer: Abstraction in Java can be achieved using abstract classes and interfaces.
//  An abstract class can have both abstract methods (without a body) and concrete methods (with a body), while an interface can only have abstract methods (until Java 8, which introduced default methods).
// 3. What is the difference between abstract classes and interfaces in Java?
// 4. Can an abstract class have concrete methods in Java?
// 5. Can you instantiate an abstract class in Java?
// 6. What is the purpose of the `abstract` keyword in Java?
// 7. How do you declare an abstract class in Java?
// 8. Can an abstract class extend another abstract class in Java?
// 9. Can an abstract class implement an interface in Java?
// 10. What happens if you do not implement all abstract methods in a subclass of an abstract class in Java?
// 11. Can an abstract class have a constructor in Java?
// 12. How do you create an instance of a subclass of an abstract class in Java?
