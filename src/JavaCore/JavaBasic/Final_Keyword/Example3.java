package JavaCore.JavaBasic.Final_Keyword;

final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

// Error: cannot inherit from final class
// class SubClass extends FinalClass {
// }

public class Example3 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
