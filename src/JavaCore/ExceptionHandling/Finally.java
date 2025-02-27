package JavaCore.ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        System.out.println("Program Start");
        int arr[] = new int[5];


        try {
            int result = 5 / 0;

        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Hii! its running..");
        }
    }
}
