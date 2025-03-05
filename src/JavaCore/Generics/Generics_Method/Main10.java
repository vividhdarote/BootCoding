package JavaCore.Generics.Generics_Method;



public class Main10 {

    //Generic method can also be static
    public static <A,B> void print(A first, B second){
        System.out.println("First: "+first+" Second: "+second);
    }


    public static void main(String[] args) {
           Main10.print("Vividh",2);
           print(1,"Anshul");
    }
}
