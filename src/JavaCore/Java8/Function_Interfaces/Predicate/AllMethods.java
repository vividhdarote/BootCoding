package JavaCore.Java8.Function_Interfaces.Predicate;


import java.util.function.Predicate;

public class AllMethods {
    public static void main(String[] args) {

        Predicate<String> isStartWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';            //OR x.startsWith("V")
        Predicate<String> isEndWithLetterH = x -> x.toLowerCase().charAt(x.length() - 1) == 'h';

        //1. Predicate and
        Predicate<String> and = isStartWithLetterV.and(isEndWithLetterH);
        System.out.println("Vividh get Entry ?: " + and.test("Vividh"));

        //2. Predicate or
        Predicate<String> or = isStartWithLetterV.or(isEndWithLetterH);
        System.out.println("Vivek get Entry ?: " + or.test("Vivek"));

        //3. Predicate negate
        // negate is used to reverse the result of the predicate
        Predicate<String> negate = isStartWithLetterV.negate();
        System.out.println("Vivek get Entry ?: " + negate.test("Vivek"));
        System.out.println("Vividh get Entry ?: " + negate.test("Vividh"));
        System.out.println("Anshul get Entry ?: " + negate.test("Anshul"));

        //4. Predicate isEqual
        // isEqual is used to compare the input object with the target object

        Student student1 = new Student("Vividh", 100);
        Student student2 = new Student("Anshul", 100);
        Predicate<Student> isEqualStudent = Predicate.isEqual(student1);
        System.out.println("Is Student1 equal to Student2: " + isEqualStudent.test(student2));


        //5. Predicate not
        // not is used to reverse the result of the predicate
        Predicate<String> not = Predicate.not(isStartWithLetterV);
        System.out.println("Vivek get Entry ?: " + not.test("Vivek"));


    }
}


class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}