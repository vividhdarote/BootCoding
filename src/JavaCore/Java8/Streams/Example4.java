package JavaCore.Java8.Streams;

//Find Maximum element from the Array. If array have all same element return -1


import java.util.Arrays;

public class Example4 {

    //Basic Implementation
    public static int Maximum(int[] array) {

        if (array.length == 0) {
            return -1;
        }

        if (array.length == 1) {
            return array[0];
        }

        boolean allsame = true;
        int a = array[0];
        for (int x = 1; x < array.length; x++) {
            if (a != array[x]) {
                allsame = false;
            }
        }

        if (allsame) {
            return -1;
        }

        int max = array[0];
        for (int x = 1; x < array.length; x++) {
            if (array[x] > max) {
                max = array[x];
            }
        }
        return max;
    }


    //Alternate Implementation using Java's stream API
    public static int MaximumUsingStream(int[] array) {

        if(array.length==1){
            return array[0];
        }

        if (Arrays.stream(array).allMatch(x -> x == array[0])) {
            return -1;
        }

        return Arrays.stream(array).max().getAsInt();
    }

    public static void main(String[] args) {

        System.out.println("Maximum: " + Maximum(new int[]{1, 2, 3, 4, 5, 6, 7}));
        System.out.println("Maximum: " + Maximum(new int[]{1, 1, 1, 1, 1, 1, 1}));
        System.out.println("Maximum: " + Maximum(new int[]{}));
        System.out.println("Maximum: " + Maximum(new int[]{52}));
        System.out.println("Maximum: " + Maximum(new int[]{1, 1, 1, 1, 1, 1, 154}));

        System.out.println("Maximum: " + MaximumUsingStream(new int[]{5, 47, 85, 4, 4, 4}));
        System.out.println("Maximum: " + MaximumUsingStream(new int[]{1, 1, 1, 1, 1, 1, 1}));
        System.out.println("Maximum: " + MaximumUsingStream(new int[]{8}));
        System.out.println("Maximum: " + MaximumUsingStream(new int[]{}));

    }
}
