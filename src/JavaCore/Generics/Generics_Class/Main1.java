package JavaCore.Generics.Generics_Class;


/*
Now we will make Box Generic class, but before that we will study Generic Types.

Generic types allow you to define a class, interface, or method with placeholders (type parameters)
for the data types they will work with.
This enables code reusability and type safety, as it allows you to create classes, interfaces, or methods
that can operate on various types without needing to rewrite the code for each type.

A generic type is a class or interface that is parameterized over types.
For example, a generic class can work with any type specified by the user, and that type can be enforced at compile time.
*/

class Box<T>{
    private T value;

    public void setValue(T value){
        this.value=value;
    }
    public T getValue(){
        return value;
    }
}


public class Main1{
    public static void main(String[] args) {

        //For Integer
        Box <Integer> box= new Box<>();   //Box is now type safe
        box.setValue(1);  //No issue, it's an integer
        Integer i= box.getValue();   //No casting needed
        System.out.println(i);

        //For String
        Box <String> box1 = new Box<>();
        box1.setValue("Hello");
        String x=box1.getValue();
        System.out.println(x);

    }
}


/*
Here, Box<T> is a generic class.
The type parameter T will be replaced with a specific type when an object of Box is created.
Now, the Box class is type-safe, and we will not encounter the ClassCastException because the types are enforced at compile time.
So, In simpler terms, generics allow you to write code that can work with any object type while ensuring type safety at compile time.

Generics help us write more flexible and reusable code.
For example, without generics, we would have to write multiple versions of the same class to handle different data types, leading to code duplication.*/
