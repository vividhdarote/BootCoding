package JavaCore.Java_OOPS.Polymorphism;


// Runtime Polymorphism (Method Overriding):

class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    // Overriding the parent class method
    @Override
    void sound(){
        System.out.println("Dog is barking");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.sound();  // Calls Dog's sound() method at runtime
    }
}

//What is runtime polymorphism in Java?
//How is method overriding related to runtime polymorphism?
//What is dynamic method dispatch?
//Can you achieve runtime polymorphism with static methods? Why or why not?
//How does Java determine which overridden method to call at runtime?
//What is the role of the @Override annotation in runtime polymorphism?
//Can constructors be overridden to achieve runtime polymorphism?
//Give an example of runtime polymorphism using interfaces.
//What happens if a subclass does not override a method from its superclass?
//How does runtime polymorphism support loose coupling in Java applications?