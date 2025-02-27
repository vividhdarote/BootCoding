package JavaCore.Java_OOPS.Abstraction;


interface Vehicle{

    // Abstract method (implicitly public and abstract)
    void run();

    // Interface abstract methods cannot have body
    default void speed(){
        System.out.println("Speeding");
    }
}

class Car implements Vehicle{

    @Override
    public void run(){
        System.out.println("Car is Running");
    }
}


public class InterfaceMethod {
    public static void main(String[] args) {
        Car car=new Car();
        car.run();   // Calls implemented method
        car.speed(); // Calls default method
    }
}
