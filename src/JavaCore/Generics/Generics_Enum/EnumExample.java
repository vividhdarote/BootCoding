package JavaCore.Generics.Generics_Enum;

//Enums can contain generic methods just like normal classes.
//This allows the enum to perform operations with type parameters.
//Here is an example of an enum with a generic method:


enum Operation{
    ADD , SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T a, T b){
        switch (this){
            case ADD:
                return a.doubleValue() + b.doubleValue();
            case SUBTRACT:
                return a.doubleValue() - b.doubleValue();
            case MULTIPLY:
                return a.doubleValue() * b.doubleValue();
            case DIVIDE:
                return a.doubleValue() / b.doubleValue();
            default:
                throw new AssertionError("Unknown operation: " + this);
        }
    }
}

public class EnumExample {
    public static void main(String[] args) {
        double result1= Operation.ADD.apply(4,5);
        double result2= Operation.SUBTRACT.apply(4,5);
        double result3= Operation.MULTIPLY.apply(4,5);
        double result4= Operation.DIVIDE.apply(4,5);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
