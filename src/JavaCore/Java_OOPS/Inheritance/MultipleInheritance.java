package JavaCore.Java_OOPS.Inheritance;

interface Animal3 {
    void eat();
}

interface Bird {
    void fly();
}

class Bat implements Animal3, Bird {
    public void eat() {
        System.out.println("Bat eats insects.");
    }

    public void fly() {
        System.out.println("Bat is flying.");
    }
}


public class MultipleInheritance {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();
        bat.fly();
    }
}
