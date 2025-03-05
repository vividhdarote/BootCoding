package JavaCore.Generics.Generics_Method;

//Generic methods are methods that allow for type parameters,
//meaning they can be defined to accept different types of parameters in a type-safe way.
//By using generic methods, you can write code that works with any type and enforces compile-time type checking.

//The syntax of a generic method is similar to that of a regular method,
//with the addition of type parameters declared in angle brackets (<>) before the return type.
//The type parameter can be any valid identifier but is often denoted by single capital letters like T, E, K, V, etc.

public class Main9 {
    public <T> void printArray(T[] array){
        for(T element: array){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
           Main9 main9= new Main9();

           Integer[] intArray = {1,2,3,4,5};
           String[] stringArray = {"A","B","C","D","E"};

           main9.printArray(intArray);
           main9.printArray(stringArray);
    }
}
