package JavaCore.Generics.Generics_Constructor;

//A generic constructor can be defined in a generic class.
//However, the generic type parameter for the constructor may be different from the generic type parameter of the class:

class NumberPrinter {
    <T extends Number> NumberPrinter(T number){
        System.out.println("Number: "+number);
    }
}

class Printer{
    <T> Printer (T item){
        System.out.println("Item: "+item+" Type: "+item.getClass().getSimpleName());
    }
}


public class Main7 {
    public static void main(String[] args) {
        new NumberPrinter(1.1);
        new NumberPrinter(1);

        new Printer("Vividh");
        new Printer(13);
        new Printer(12.3f);
        new Printer(123.9);
        new Printer(true);
    }
}
