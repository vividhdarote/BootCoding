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



//Generate all the possible questions from the above code snippet:
// 1. What is the purpose of the `ifStatement` method in the `IfElse` class?
// 2. How does the `IfElseStatement` method determine if a number is positive or negative?
// 3. What grading system is implemented in the `IfElseIfStatement` method?
// 4. Explain the logic behind the nested `if` statements in the `NestedIf` method.
// 5. How does the `SwitchCase` method determine the day of the week based on an integer input?
// 6. What will be the output of the `ifStatement` method when `num` is set to 10?
// 7. What happens if the `marks` variable in the `IfElseIfStatement` method is set to 65?
// 8. How does the `NestedIf` method check if a year is a leap year?
// 9. What is the significance of the `break` statement in the `SwitchCase` method?
// 10. How can the `IfElse` class be modified to handle user input for the day of the week in the `SwitchCase` method?
// 11. What will be the output if the `year` variable in the `NestedIf` method is set to 2000?
// 12. Can the `IfElse` class be extended
// to include additional methods for more complex conditional logic? If so, provide an example.
// 13. How does the `if` statement in the `ifStatement` method differ from the `if-else` statement in the `IfElseStatement` method?
// 14. What is the output of the `IfElseIfStatement` method when `marks` is set to 95?
// 15. How can the `SwitchCase` method be modified to include an option for invalid input?
// 16. What will be the output of the `SwitchCase` method if `day` is set to 8?
// 17. How does the `NestedIf` method handle years that are divisible by 100 but not by 400?
// 18. What is the purpose of using `Scanner` in the `main` method of the `IfElse` class?
// 19. How can the `IfElse` class be tested to ensure all methods work as expected?
// 20. What are the advantages of using `switch` statements over multiple `if-else` statements in the `SwitchCase` method?
