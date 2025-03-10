package JavaCore.Java8.LambdaExpression.Interface;

interface Student1 {
    public String setName(String name);
}

public class Example2 {
    public static void main(String[] args) {

        //Another Lambda Expression example
        //without using return keyword and avoid using curly braces
        Student1 student1 = name -> name+" is a Student";
        String s= student1.setName("Vividh");
        System.out.println(s);
    }
}
