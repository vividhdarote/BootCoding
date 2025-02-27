package JavaCore.ExceptionHandling;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) throws MyException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        try {
            if (age > 50) {
                throw new MyException("Age is more than 50");
            }

        }
        catch (MyException e){
            System.out.println("My Custom Exception is: "+e.getMessage());
        }
    }
}

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}