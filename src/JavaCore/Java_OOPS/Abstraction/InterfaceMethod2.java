package JavaCore.Java_OOPS.Abstraction;

interface A{
    default void sayHello(){
        System.out.println("A say Hello");
    }
}

interface B{
    default void sayHello(){
        System.out.println("B say Hello");
    }
}

public class InterfaceMethod2 implements A,B{
    @Override
    public void sayHello(){
        B.super.sayHello();
    }

    public static void main(String[] args) {
        InterfaceMethod2 method = new InterfaceMethod2();
        method.sayHello();
    }
}


// we can use main method inside interface
/*

interface C {
    public static void main(String[] args) {
        System.out.println("Hello From C interface");
    }
}*/
