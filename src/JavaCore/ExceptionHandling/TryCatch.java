package JavaCore.ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Program Start");
        int arr[]=new int[5];


        try{
            int result=5/0;
            System.out.println(arr[8]);

        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e);
        }

    }
}