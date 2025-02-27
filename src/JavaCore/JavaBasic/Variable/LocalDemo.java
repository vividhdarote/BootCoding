package JavaCore.JavaBasic.Variable;

public class LocalDemo {
    public void display() {
        int localVar = 10; // Local variable
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        LocalDemo obj=new LocalDemo();
        obj.display();
    }
}
