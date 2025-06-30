package JavaCore.JavaBasic;

public class  Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Unary Operators
        System.out.println("\nUnary Operators:");
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b is " + (a == b));
        System.out.println("a != b is " + (a != b));
        System.out.println("a > b is " + (a > b));
        System.out.println("a < b is " + (a < b));
        System.out.println("a >= b is " + (a >= b));
        System.out.println("a <= b is " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y is " + (x && y));
        System.out.println("x || y is " + (x || y));
        System.out.println("!x is " + (!x));

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));
        System.out.println("a >>> 2 = " + (a >>> 2));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a;
        System.out.println("c = a: " + c);
        c += b;
        System.out.println("c += b: " + c);
        c -= b;
        System.out.println("c -= b: " + c);
        c *= b;
        System.out.println("c *= b: " + c);
        c /= b;
        System.out.println("c /= b: " + c);
        c %= b;
        System.out.println("c %= b: " + c);

        // Ternary Operator
        System.out.println("\nConditional Operator:");
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);

        // instanceof Operator
        System.out.println("\ninstanceof Operator:");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
    }
}


//generated all questions from this topic
// 1. What are the different types of operators in Java?
// answer: Arithmetic, Unary, Relational, Logical, Bitwise, Assignment, Ternary, and instanceof operators.
// 2. How do arithmetic operators work in Java?
// answer: They perform basic mathematical operations like addition, subtraction, multiplication, division, and modulus.
// 3. What is the purpose of unary operators in Java?
// answer: Unary operators perform operations on a single operand, such as incrementing or decrementing a value.
// 4. Can you explain relational operators and their usage?
// 5. How do logical operators function in Java?
// 6. What are bitwise operators and how are they used?
// 7. How do assignment operators work in Java?
// 8. What is the ternary operator and how does it differ from if-else statements?
// 9. Can you explain the instanceof operator and its use cases?
// answer: The instanceof operator checks whether an object is an instance of a specific class or interface.
// 10. How do you use the shift operators in Java?
// 11. What is the difference between the left shift (<<) and right shift (>>) operators?
// 12. How do you perform bitwise operations on integers in Java?
// 13. Can you provide examples of using logical operators with boolean values?
// 14. How do you use the conditional operator (?:) in Java?
// 15. What is the precedence of operators in Java and how does it affect expressions?
// 16. How do you handle operator overloading in Java?
// answer: Java does not support operator overloading like some other languages (e.g., C++). Each operator has a fixed meaning and cannot be changed for user-defined types.
// 17. Can you explain the difference between == and equals() in Java?
// answer: The == operator checks for reference equality (whether two references point to the same object), while the equals() method checks for value equality (whether two objects are logically equivalent).
// 18. How do you use the increment (++) and decrement (--) operators in Java?
// 19. What are the implications of using post-increment (a++) vs pre-increment (++a)?
// 20. How do you use compound assignment operators like +=, -=, *=, /=, and %= in Java?
// 21. Can you explain the short-circuit behavior of logical operators in Java?
// answer: Short-circuit behavior means that in expressions using && (AND) and || (OR), evaluation stops as soon as the result is determined. For example, in `x && y`, if `x` is false, `y` is not evaluated because the overall expression cannot be true.
// 22. How do you use bitwise operators with boolean values in Java?

//explain bitwise operators in Java in Table format
// | Operator | Description                          | Example          | Result |
// |----------|--------------------------------------|------------------|--------|
// | &        | Bitwise AND                          | 5 & 3            | 1      |
// |          | (0101 & 0011)                        | (0001)           |        |
// | ^        | Bitwise XOR                          | 5 ^ 3            | 6      |
// |          | (0101 ^ 0011)                        | (0110)           |        |
// | ~        | Bitwise NOT                          | ~5               | -6     |
// |          | (Inverts bits of 5, which is 0101)   | (1010)           |        |
// | <<       | Left shift                           | 5 << 1           | 10     |
// |          | (Shift bits of 5 one position left)  | (1010)           |        |
// | >>       | Right shift                          | 5 >> 1           | 2      |
// |          | (Shift bits of 5 one position right) | (0010)           |        |
// | >>>      | Unsigned right shift                 | -5 >>> 1         | 2147483645 |
// |          | (Shifts bits of -5, filling with 0)  | (01111111111111111111111111111010) |
// |          | Bitwise OR                           | 5 | 3            | 7      |
// |          | (0101 | 0011)                        | (0111)           |        |