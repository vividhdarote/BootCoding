package JavaCore.JavaBasic;

import java.util.Scanner;

public class IfElse {


    //1. If Statement
    public static void ifStatement(){
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

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    //5.Switch Case
    void SwitchCase(int day) {

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
        IfElse.ifStatement();
        ob.IfElseStatement();
        ob.IfElseIfStatement();

        Scanner s= new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year=s.nextInt();

        if(IfElse.NestedIf(year)){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }

        System.out.print("Enter Day: ");
        int day = s.nextInt();
        ob.SwitchCase(day);



    }
}



// all the possible questions from this topic
// 1. What is the difference between if and if-else statements?
// 2. How does the switch-case statement work in Java?
// 3. Can you explain the concept of nested if statements?
// 4. What is the purpose of the else-if ladder in Java?
// 5. How do you handle multiple conditions in Java using if-else statements?
// 6. What is the significance of the default case in a switch statement?
// 7. How do you check for leap years using if-else statements?
// 8. Can you provide an example of using a switch statement with strings?
// answer: No, switch statements in Java do not support strings until Java 7. Prior to that, they only supported primitive data types and enums.
// 9. How do you use the ternary operator as a shorthand for if-else statements?
// 10. What are the advantages of using switch statements over if-else statements?
// 11. How do you handle invalid input in switch-case statements?
// 12. Can you explain the short-circuit evaluation in if statements?
// 13. How do you use logical operators (AND, OR) in if statements?
// 14. What is the difference between == and equals() in if statements?
// answer: The == operator checks for reference equality, while the equals() method checks for value equality.
// 15. How do you use if statements to validate user input?
// 16. Can you explain the concept of fall-through in switch statements?
// 17. How do you use switch statements with enums in Java?
// 18. What is the role of break statements in switch-case blocks?
// 19. How do you use if statements to compare strings in Java?
// 20. Can you provide an example of using nested if statements for complex conditions?
// 21. How do you use switch statements with character data types?
// 22. What is the difference between switch statements and if-else statements in terms of performance?
// 23. How do you handle multiple cases in a switch statement?
