package JavaCore.JavaBasic;

public class Loops {
    public static void main(String[] args) {

        //1. For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }


        // 2.Enhanced for loop (for-each loop)
        // We use this when we dont know the size of array
        int[] numbers = {10, 20, 30, 40};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }


        //3. While Loop
        // Run Until while condition not getting false
        int i = 1;
        while (i <= 5) {
            System.out.println("While loop iteration: " + i);
            i++;
        }


        //4. Do While Loop
        int x = 1;
        do {
            System.out.println("Do-while iteration: " + x);
            x++;
        } while (x <= 5);


        //5. break and continue in loops
        //      break: exits the loop immediately.
        //      continue: skips the current iteration and moves to the next.

        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                System.out.println("Break at: " + j);
                break;
            }
        }

        // Continue example
        for (int k = 1; k <= 5; k++) {
            if (k == 3){
                continue;
            }
            System.out.println("Continue skips: " + k);
        }


        //6. Infinite Loop
        while (true) {
            System.out.println("Running infinitely...");
            break; // Remove this to run forever (be careful!)
        }
    }
}
