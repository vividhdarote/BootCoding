package JavaCore.Generics.Generics_Interface;

/*
Generic Interface
A generic interface in Java allows you to define an interface with type parameters.
This means that the interface can work with any type specified at the time of implementation.
Generic interfaces are commonly used when the type of the objects that the interface deals with is not known until runtime.

You declare a generic interface in the same way you would declare a generic class or method,
using angle brackets <> to specify type parameters.
Here's a basic example of a generic interface:
*/


interface Container <T>{
    void add(T value);
    T get();
}



class GenericContainer<T> implements Container<T> {

    private T value;

    @Override
    public void add(T value) {
        this.value=value;
    }

    @Override
    public T get() {
        return value;
    }
}



public class Main3{
    public static void main(String[] args) {

        //For String
        GenericContainer obj= new GenericContainer();
        obj.add("Vividh");
        String s=(String) obj.get();   // casting needed
        System.out.println(s);

        //For Integer
        GenericContainer obj1= new GenericContainer();
        obj1.add(1);
        int i= (int) obj1.get();    //casting needed
        System.out.println(i);

        GenericContainer <String> obj2= new GenericContainer<>();
        obj2.add("Anshul");
        String s1 = obj2.get();   //no casting needed, when you use the parametrized class
        System.out.println(s1);
    }
}