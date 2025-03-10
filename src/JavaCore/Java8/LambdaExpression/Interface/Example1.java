package JavaCore.Java8.LambdaExpression.Interface;


interface Student{
    public String setName(String name);
}


public class Example1 {
    public static void main(String[] args) {

        //Using Lambda Expression interface class
        Student mcaStudent1 = (String name)->{
          return name+" is a MCA Topper";
        };
        String name1= mcaStudent1.setName("Vividh");
        System.out.println(name1);


       //OR

        // you can also avoid writing datatype of interface in parentheses
        // (String name) can replace by (name) only
        Student mcaStudent2 = (name) ->{           //(String name) -> (name)
            return   name+" is a MCA Student.";
        };
        String name2 = mcaStudent2.setName("");
        System.out.println(name2);

    }
}
