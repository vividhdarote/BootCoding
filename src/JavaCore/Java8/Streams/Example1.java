package JavaCore.Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = list.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
 //                                    ----------------
 //                                            ^
 //                                            |
 //                                        Predicate

        System.out.println(sum);

        //another method
        int [] array ={1,2,3,4,5,6,7,8,9,10};
        int sum1 = Arrays.stream(array).filter(x -> x % 2 == 0).sum();
        System.out.println(sum1);



        //Same as above
        int sum2 = 0;
        for (Integer x : list) {
            if (x % 2 == 0) {
                sum2 += x;
            }
        }
        System.out.println(sum2);


    }
}