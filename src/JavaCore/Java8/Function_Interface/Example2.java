package JavaCore.Java8.Function_Interface;

//This concept can be applied in many fields and scenarios where data needs to be processed, filtered, or transformed.
//  Filtering students based on their names, grades, or other attributes.
//  Processing lists of employees to filter out those who match certain criteria, such as department, role, or performance rating.
//  Filtering datasets of research subjects or data points based on specific criteria for analysis.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Example2 {
    public static void main(String[] args) {

        Function<String,String> function1 = x -> x.substring(0,3);
        System.out.println(function1.apply("Vividh"));    // Viv

        Function<List<Student>, List<Student>> studentWithVivInPrefix = li ->{
            List<Student> result = new ArrayList<>();
            for(Student s: li){
                if(function1.apply(s.getName()).equalsIgnoreCase("viv")){     //equalsIgnoreCase use for ignore any type of Upper or Lower case
                    result.add(s);
                }
            }
            return result;
        };

        Student s1 = new Student(1,"Vividh");
        Student s2 = new Student(2,"Vivian");
        Student s3 = new Student(3,"Vivek");
        Student s4 = new Student(4,"Anshul");

        List<Student> students = Arrays.asList(s1, s2, s3, s4);
        List<Student> filterStudent = studentWithVivInPrefix.apply(students);
        System.out.println(filterStudent);

    }

    private static class Student{
        private int id;
        private String name;

        Student(int id,String name){
            this.id=id;
            this.name=name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "id=" + id + " name=" + name;
        }
    }
}
