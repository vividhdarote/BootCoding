package JavaCore.MultiThreading;

import java.util.Arrays;
import java.util.List;


class Even extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

//using stream
class Odd extends Thread{
    public void run(){
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(n-> n%2==1).forEach(System.out::println);
    }
}
public class Example5 {
    public static void main(String[] args) {
       new Even().start();
       new Odd().start();
    }
}
