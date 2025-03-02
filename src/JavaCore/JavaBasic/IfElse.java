package JavaCore.JavaBasic;

import java.util.Scanner;

public class IfElse {


    //1. If Statement
    void ifStatement(){
        int num = 10;
        if (num > 0) {
            System.out.println(num + " is positive.");
        }
    }


    //2. If else Statement
    void IfElseStatement(){
        int num1 = -5;
        if (num1 > 0) {
            System.out.println(num1 + " is positive.");
        } else {
            System.out.println(num1 + " is negative.");
        }
    }


    //3. If Else-If
    void IfElseIfStatement(){
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }



    //4.Nested If
    public static boolean NestedIf(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return true;
        }
    }


    //5.Switch Case
    void SwitchCase(){
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }





    public static void main(String[] args) {
        IfElse ob= new IfElse();
        ob.ifStatement();
        ob.IfElseStatement();
        ob.IfElseIfStatement();

        Scanner s= new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year=s.nextInt();

        if(IfElse.NestedIf(year)){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }

        ob.SwitchCase();






    }
}
