package JavaCore.MultiThreading.LambdaExpression;


interface Student{
    public String setName(String name);
}

interface Student1{
    public void setName(String name);
}



class College implements Student{

    @Override
    public String setName(String name) {
        return name+" call from implementation class";
    }
}



public class Example2 {
    public static void main(String[] args) {

        //1.
        //Common method
        College college = new College();
        String string = college.setName("Aman");
        System.out.println(string);


        //2.
        //Anonymous interface class
        //This avoid the use of College implementation class
        Student engineeringStudent= new Student() {
            @Override
            public String setName(String name) {
                return  name+" is a Engineering Student.";
            }
        };
        String name1 = engineeringStudent.setName("Anshul");
        System.out.println(name1);



        //3.
        //Using Lambda Expression interface class
        // you can also avoid writing datatype of interface in parentheses
        // (String name) can replace by (name) only
        Student mcaStudent = (name) ->{           //(String name) -> (name)
            return   name+" is a MCA Student.";
        };
        String name2 = mcaStudent.setName("Vividh");
        System.out.println(name2);



        //4.
        //Another Lambda Expression example
        //without using return keyword and avoid using curly braces
        Student mcaStudent1 = (name)-> name+" is a MCA Student";
        String name3= mcaStudent1.setName("Prasanna");
        System.out.println(name3);



        //5.
        //Another Lambda Expression example for non-return type -> void()
        // Allow Only for single argument/parameter
        // and avoid Curly Braces
        Student1 voidStudent = name -> System.out.println(name+ " is call from non-return type");
        voidStudent.setName("Donald");

    }
}
