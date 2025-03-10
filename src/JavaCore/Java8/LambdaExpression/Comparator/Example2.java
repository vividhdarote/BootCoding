package JavaCore.Java8.LambdaExpression.Comparator;

import java.util.ArrayList;
import java.util.Collections;

class Student {
    public Integer id;
    public String name;

    Student (Integer id, String name){
        this.id = id;
        this.name= name;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name ;
    }
}

public class Example2 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Vividh");
        Student s2 = new Student(3,"Anshul");
        Student s3 =  new Student(2,"Tom");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list,(a,b)-> a.id - b.id);    // Default And Ascending Order
        System.out.println(list);

        Collections.sort(list,(a,b)-> b.id - a.id );   //Descending Order
        System.out.println(list);


    }
}
