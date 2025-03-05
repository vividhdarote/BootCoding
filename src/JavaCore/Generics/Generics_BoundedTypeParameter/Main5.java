package JavaCore.Generics.Generics_BoundedTypeParameter;

//In this example, the type parameter T is restricted to subclasses of Number,
// so only numeric types like Integer, Double, etc., can be used.

class Box <T extends Number>{
    private T value;

    public void setValue( T value){
        this.value=value;
    }
    public T getValue(){
        return value;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Box <Integer> box = new Box<>();
        Box <Double> box1 = new Box<>();
        Box <Float>  box2 = new Box<>();
        Box <Short>  box3 = new Box<>();
        Box <Byte>   box4 = new Box<>();
        Box <Long>   box5 = new Box<>();

      /*
        Box <String>    box6 = new Box<>();       //Exception Because String is not Comes under (Number Superclass)
        Box <Character> box7 = new Box<>();   //Exception Because Character is not Comes under (Number Superclass)
        Box <Boolean>   box8 = new Box<>();     //Exception Because Boolean is not Comes under (Number Superclass)  */


    }
}
