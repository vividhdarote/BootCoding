package JavaCore.JavaBasic.Final_Keyword;

class Parent{
    final void display(){
        System.out.println("Hello");
    }
}

class Child extends Parent{

    // Error: cannot override final method
    // void display() {
    //     System.out.println("Trying to override.");
    // }
}
public class Example2 {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display();
    }
}
