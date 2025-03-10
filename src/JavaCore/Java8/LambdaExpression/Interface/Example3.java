package JavaCore.Java8.LambdaExpression.Interface;

interface Student2{
    public void setName(String name);
}

public class Example3 {
    public static void main(String[] args) {

        Student2 student2 = name -> System.out.println( name+" is Student from G.H.Raisoni");
        student2.setName("Vividh");

    }
}
