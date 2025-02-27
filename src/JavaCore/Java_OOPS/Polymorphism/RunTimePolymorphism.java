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
