package JavaCore.Java_OOPS.Inheritance;


class Animal1{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog1 extends Animal1{
    void bark(){
        System.out.println("Barking...");
    }
}

class Puppy extends Dog1{
    void weep(){
        System.out.println("Weeping...");
    }
}


public class MultiLevelInheritance {
    public static void main(String[] args) {

        Puppy puppy=new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}
