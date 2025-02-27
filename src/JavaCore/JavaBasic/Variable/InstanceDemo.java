package JavaCore.JavaBasic.Variable;

public class InstanceDemo {
    int instanceVar = 20; // Instance variable

    public static void main(String[] args) {
        InstanceDemo obj1 = new InstanceDemo();
        InstanceDemo obj2 = new InstanceDemo();

        obj1.instanceVar = 30; // Changing value for obj1

        System.out.println("obj1 instanceVar: " + obj1.instanceVar); //Changed  //30
        System.out.println("obj2 instanceVar: " + obj2.instanceVar); // Unchanged  //20
    }
}
