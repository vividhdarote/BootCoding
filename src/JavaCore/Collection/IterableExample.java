package JavaCore.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class IterableExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : list) {
            System.out.println(i);
        }

        Iterator<Integer> itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //Error because of modification while reading, use copyonwritearraylist
       /* for(Integer i: numbers) {
            if (i % 2 == 0) {
                numbers.remove(i);
            }
        }*/

        Iterator<Integer> iterator= numbers.iterator();
        while(iterator.hasNext()){
            Integer number= iterator.next();
            if(number%2==0){
                iterator.remove();
            }
        }
        System.out.println(numbers);

        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }


    }
}
