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
