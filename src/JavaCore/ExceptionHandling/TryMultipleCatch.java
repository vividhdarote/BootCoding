package JavaCore.ExceptionHandling;

public class TryMultipleCatch {
    public static void main(String[] args) {
        System.out.println("Program Start");
        int arr[]=new int[5];


        try{
            int result=5/0;
            System.out.println(arr[8]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound excpetion occur");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
    }
}