package JavaCore.Java_OOPS.Polymorphism;


// Compile Time Polymorphism: (Method Overloading)


class Calculator{

    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator ob=new Calculator();
        System.out.println(ob.add(2,3));
        System.out.println(ob.add(2,3,4));
    }
}


//What is compile-time polymorphism in Java?
//How is method overloading related to compile-time polymorphism?
//Can constructors be overloaded in Java? Give an example.
//What are the rules for method overloading in Java?
//Is it possible to overload methods by changing only the return type? Why or why not?
//ans:No, overloading cannot be done by changing only the return type because the compiler cannot distinguish methods by return type alone.
//How does Java resolve which overloaded method to call at compile time?
//Can you overload static methods in Java?
//What is the difference between method overloading and method overriding?
//Can you overload a method by changing the access modifier?
//ans:No, changing only the access modifier does not constitute overloading. The parameter list must be different.
//Give an example of method overloading with different data types as parameters.