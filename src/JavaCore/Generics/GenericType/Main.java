package JavaCore.Generics.GenericType;

public class Main {
    public static void main(String[] args) {
        Box box= new Box();
        box.setValue(1);
        Object x= box.getValue();
        System.out.println(x);

        String i = (String) box.getValue(); // EXCEPTION !!!  Not compile time. But Run time error
        System.out.println(i);

    }
}
