package JavaCore.Java_OOPS.Abstraction;


interface Student{
    public String setName(String name);
}

public class InterfaceMethod3 {
    public static void main(String[] args) {

        //Anonymous interface class
        //This avoid the use of Parent implementation class
        Student student = new Student() {
            @Override
            public String setName(String name) {
                return name+" is a Engineering Student.";
            }
        };
        String name1 = student.setName("Anshul");
        System.out.println(name1);

    }
}
