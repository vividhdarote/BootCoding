package JavaCore.ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Program Start");
        int arr[]=new int[5];


        try{
            int result=5/0;
            System.out.println(arr[8]);

        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e);
        }

    }
}

//generate all possible questions on exception handling with answers
// 1. What is the purpose of exception handling in Java?
// Answer: The purpose of exception handling in Java is to manage runtime errors, allowing the program to continue executing or to terminate gracefully without crashing.
// 2. What is a try-catch block in Java?
// Answer: A try-catch block in Java is a construct that allows you to write code that may throw an exception (inside the try block) and handle that exception (inside the catch block).
// 3. What happens if an exception is not caught in Java?
// Answer: If an exception is not caught in Java, it propagates up the call stack, potentially causing the program to terminate and print a stack trace to the console.
// 4. Can multiple exceptions be caught in a single catch block in Java?
// Answer: Yes, multiple exceptions can be caught in a single catch block using the multi-catch feature introduced in Java 7, where you can specify multiple exception types separated by a pipe (|).
// 5. What is the difference between checked and unchecked exceptions in Java?
// Answer: Checked exceptions are exceptions that are checked at compile-time, requiring explicit handling (e.g., IOException). Unchecked exceptions are not checked at compile-time and include runtime exceptions (e.g., NullPointerException).
// 6. How can you create a custom exception in Java?
// Answer: You can create a custom exception in Java by extending the Exception class (for checked exceptions) or RuntimeException class (for unchecked exceptions) and providing a constructor that accepts a message or cause.
// 7. What is the finally block in Java exception handling?
// Answer: The finally block in Java is a block that follows a try-catch block and is always executed, regardless of whether an exception was thrown or caught. It is typically used for cleanup operations, such as closing resources.
// 8. What is the purpose of the throw keyword in Java?
// Answer: The throw keyword in Java is used to explicitly throw an exception, either a built-in exception or a custom exception, from a method or block of code.
// 9. What is the difference between throw and throws in Java?
// Answer: The throw keyword is used to throw an exception explicitly, while the throws keyword is used in a method signature to declare that the method can throw one or more exceptions, allowing the caller to handle them.
// 10. How can you handle multiple exceptions in separate catch blocks?
// Answer: You can handle multiple exceptions in separate catch blocks by writing individual catch blocks for each exception type you want to handle, allowing for specific handling of different exceptions.
// 11. What is the purpose of the try-with-resources statement in Java?
// Answer: The try-with-resources statement in Java is used to automatically manage resources that implement the AutoCloseable interface, ensuring that they are closed automatically at the end of the try block, even if an exception occurs.
// 12. Can you catch an exception thrown by a finally block?
// Answer: No, you cannot catch an exception thrown by a finally block in the same try-catch structure. If an exception occurs in the finally block, it will propagate up the call stack and can be caught by an outer try-catch structure if present.
// 13. What is the purpose of the catch block in exception handling?
// Answer: The catch block in exception handling is used to handle exceptions that are thrown in the try block, allowing you to define how to respond to specific exceptions and prevent program termination.
// 14. How can you rethrow an exception in Java?
// Answer: You can rethrow an exception in Java by using the throw keyword within a catch block, allowing you to propagate the exception to a higher level for further handling or logging.
