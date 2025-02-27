package JavaCore.JavaBasic.Variable;

public class StaticDemo {
    static int staticVar = 50; // Static variable

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        obj1.staticVar = 100; // Modifies shared variable

        System.out.println("obj1 staticVar: " + obj1.staticVar); //100
        System.out.println("obj2 staticVar: " + obj2.staticVar); // Reflects change  //100
        System.out.println("Access via class name: " + StaticDemo.staticVar);  //100
    }
}
