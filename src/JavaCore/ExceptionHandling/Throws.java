package JavaCore.ExceptionHandling;

public class Throws {

    static int[] arr=new int[5];

    public static void main(String[] args) {
        try{
            System.out.println(method(arr));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static int method(int[] arr) throws ArrayIndexOutOfBoundsException {
        arr[0]=1;
        return arr[8];
    }
}