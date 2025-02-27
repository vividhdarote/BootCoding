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
