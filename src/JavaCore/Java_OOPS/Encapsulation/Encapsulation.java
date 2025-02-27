package JavaCore.Java_OOPS.Encapsulation;


class Education{

    // Private fields (data hiding)
    private String name;
    private int age;

    // Constructor to initialize details
    Education(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
        else{
            System.out.println("Enter positive age");
        }
    }
}
public class Encapsulation {
    public static void main(String[] args) {

        Education education=new Education("Vividh",18);
        System.out.println("Name: "+education.getName());
        System.out.println("Age: "+education.getAge());

        education.setName("Anshul");

        System.out.println("Name: "+education.getName());
        System.out.println("Age: "+education.getAge());
    }
}
