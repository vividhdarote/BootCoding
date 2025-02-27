package JavaCore.Java_OOPS.Inheritance;

interface Animal4{
    void eat();
}

interface Bird4{
    void fly();
}

interface Bat4 extends Animal4, Bird4{
    void hang();
}

class FruitBat implements Bat4{
    public void eat() {
        System.out.println("Fruit bat eats fruits.");
    }

    public void fly() {
        System.out.println("Fruit bat is flying.");
    }

    public void hang() {
        System.out.println("Fruit bat hangs upside down.");
    }
}


public class HybridInheritance {
    public static void main(String[] args) {
        FruitBat fruitBat=new FruitBat();
        fruitBat.eat();
        fruitBat.fly();
        fruitBat.hang();
    }
}
