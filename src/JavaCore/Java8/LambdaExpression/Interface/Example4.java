package JavaCore.Java8.LambdaExpression.Interface;

interface MathOperation{
   public int operation(int a, int b);
}

public class Example4 {
    public static void main(String[] args) {

        MathOperation addition = (a,b)-> a+b;
        MathOperation subtraction = (a,b)-> a-b;
        MathOperation multiply = (a,b)-> a*b;
        MathOperation divide =(a,b)-> a/b;

        int result1 = addition.operation(10,5);
        int result2 = subtraction.operation(10,5);
        int result3 = multiply.operation(10,5);
        int result4 = divide.operation(10,5);


        System.out.println("Addition: "+result1);
        System.out.println("Subtarct: "+result2);
        System.out.println("Multiply: "+result3);
        System.out.println("Divide:   "+result4);
    }
}
