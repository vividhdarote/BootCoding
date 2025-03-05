package JavaCore.Generics.Generics_Constructor;


class Pair{

    <A,B> Pair(A first, B second){
        System.out.println("First: "+first+", Second: "+second);
    }
}

public class Main8 {
    public static void main(String[] args) {
        new Pair(10,14);
        new Pair(10,12.20);
        new Pair("Vividh",40);
        new Pair(1,"Anshul");
    }
}
