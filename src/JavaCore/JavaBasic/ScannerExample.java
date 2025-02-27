package JavaCore.JavaBasic;

import java.util.Scanner;

public class  ScannerExample {
    private static void add(int a, int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two input");
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a,b);
    }
}
