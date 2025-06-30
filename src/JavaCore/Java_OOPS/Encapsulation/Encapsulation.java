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


//generate all possible questions on this topic and tricky questions
// 1. What is encapsulation in Java?
// answer: Encapsulation is a fundamental principle of object-oriented programming that restricts direct access to an object's data and methods,
// allowing them to be accessed only through public methods (getters and setters).
// This helps in protecting the integrity of the data and controlling how it is accessed or modified.
//What is Object-Oriented Programming (OOP)?
// answer: Object-Oriented Programming (OOP) is a programming paradigm that uses objects and classes to structure software design.
// 2. How does encapsulation help in data hiding?
// answer: Encapsulation helps in data hiding by restricting access to the internal state of an object.
// 3. Can you explain the difference between private, public, and protected access modifiers?
// private: The member is accessible only within the same class.
// public: The member is accessible from any other class.
// protected: The member is accessible within the same package and by subclasses (even if they are in different packages).
// 4. Why is it a good practice to use getters and setters in encapsulation?
// answer: Using getters and setters allows controlled access to an object's fields, enabling validation and encapsulation of logic.
// 5. How can encapsulation improve code maintainability?
// 6. What happens if you try to access a private field directly from outside its class?
// 7. Can you provide an example of encapsulation in Java?
// 8. How does encapsulation relate to the principles of object-oriented programming?
// 9. What are the advantages of using encapsulation in Java?
// answer: Encapsulation provides several advantages, including improved data security, easier maintenance, better code organization,
// and the ability to change the internal implementation without affecting external code.
// 10. Can you modify the fields of an encapsulated class directly?
// 11. How can you enforce validation in setters when using encapsulation?
// 12. What is the role of constructors in encapsulation?
// answer: Constructors are used to initialize the state of an object when it is created, ensuring that the object starts in a valid state.
// 13. Can you explain how encapsulation can lead to better security in your code?
// 14. How does encapsulation help in reducing complexity in large applications?
// 15. Can you give an example of a situation where encapsulation might not be necessary?
// 16. How can encapsulation be used to control access to sensitive data?
// 17. What is the difference between encapsulation and abstraction in Java?
// answer: Encapsulation is about bundling data and methods that operate on that data within a single unit (class),
// while abstraction is about hiding complex implementation details and showing only the essential features of an object.
// 18. How can you achieve encapsulation in Java without using getters and setters?
// 19. Can you explain how encapsulation can help in unit testing?
// 20. What are some common mistakes developers make when implementing encapsulation?
