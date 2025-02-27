package JavaCore.Java_OOPS.Inheritance;

class Animal2{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog2 extends Animal1{
    void bark(){
        System.out.println("Barking...");
    }
}

class Cat extends Animal2{
    void meow(){
        System.out.println("Meowing...");
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog2 dog=new Dog2();
        dog.eat();
        dog.bark();

        Cat cat=new Cat();
        cat.eat();
        cat.meow();
    }
}
