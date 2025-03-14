package JavaCore.Java8.Reference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}


public class ConstructorReference {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Vividh", "Anshul", "Dumri");

        List<Student> students = names.stream().map(x -> new Student(x)).collect(Collectors.toList());
        System.out.println(students);

        //same as above, to call constructor reference
        List<Student> students1 = names.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(students1);
    }
}
