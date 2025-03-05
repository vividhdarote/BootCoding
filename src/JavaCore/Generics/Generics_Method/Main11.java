package JavaCore.Generics.Generics_Method;


//Generic Methods and Method Overloading

public class Main11 {

    public <T> void display(T item){
        System.out.println("Generic Display: "+item);
    }

    public void display(Integer item){
        System.out.println("Integer Display: "+item);
    }

    public static void main(String[] args) {
        Main11 main11= new Main11();
        main11.display("Vividh");   //Calling Generic Display
        main11.display(11);         //Calling Integer Display
    }
}
