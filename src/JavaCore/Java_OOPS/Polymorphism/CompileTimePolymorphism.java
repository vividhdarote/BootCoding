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
