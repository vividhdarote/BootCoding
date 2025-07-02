package JavaCore.Collection.List;


import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> list = new Stack<>();

        //1.Pushing or Adding
        System.out.print("Enter NO. of element you want to store: ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print("Enter the " + i + " element: ");
            int b = sc.nextInt();
            list.push(b);
        }

        System.out.println("Stack: " + list);
        //Output:Stack: [10, 20, 30, 40, 50]

        //2.Peek Or Access top element
        if (!list.isEmpty()) {
            System.out.println("Peeking: " + list.peek());
        }
        //Output: Peeking: 50

        //3.Pop Or Delete top element
        list.pop();
        System.out.println("Removing: " + list);
        //Output: Removing: [10, 20, 30, 40]

        //4.Access
        System.out.println(list.get(1));
        //Output: 20

        //5.Access or search by element
        System.out.println(list.search(10));
        //Output: 4
        //Because it check from top

        //6.clear
        list.clear();
        System.out.println(list);
        //Output: []
        System.out.println(list.empty());
        //Output: true

        //=============================================================
        //=============================================================

        //Multi-Threading Synchronization unliked ArrayList LinkedList


        Stack<Integer> list3 = new Stack<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list3.push(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list3.push(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of list: " + list3.size());
        // Output: 2000 accurately because Stack is synchronized


    }
}
