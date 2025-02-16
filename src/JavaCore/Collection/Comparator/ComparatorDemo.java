package JavaCore.Collection.Comparator;

import java.util.List;
import java.util.ArrayList;

public class ComparatorDemo {
    public static void main(String[] args) {

            List<Student> list = new ArrayList<>();
            list.add(new Student("Charlie",8.6f));
            list.add(new Student("Bob", 8.7f));
            list.add(new Student("Alice", 8.5f));
            list.add(new Student("Ankit", 8.5f));

            System.out.println(list);

            //========================================================
            //Ascending Order by Cgpa
            System.out.println("Ascending Order by Cgpa");

            list.sort((a,b)-> {
            if(a.getCgpa()-b.getCgpa()>0){
                return 1;
            }else if(a.getCgpa()-b.getCgpa()<0){
                return -1;
            }else{
                return a.getName().compareTo(b.getName());
            }
        });

        for(Student s : list){
            System.out.println(s.getName() + ":" + s.getCgpa());
        }








        System.out.println("-------------------------------------");

        //=======================================================
        //Descending order by cgpa
        System.out.println("Descending Order by Cgpa");

        list.sort((a,b)-> {
            if(b.getCgpa()-a.getCgpa()>0){
                return 1;
            }else if(b.getCgpa()-a.getCgpa()<0){
                return -1;
            }else{
                return a.getName().compareTo(b.getName());
            }
        });

        for(Student s : list){
            System.out.println(s.getName() + ":" + s.getCgpa());
        }






        System.out.println("--------------------------------------------");
        System.out.println("Ascending Order by Name for length of String");

        list.sort((a,b)-> {
            if(a.getName().length()-b.getName().length()>0){
                return 1;
            }else if(a.getName().length()-b.getName().length()<0){
                return -1;
            }else{
                return a.getName().compareTo(b.getName());
            }
        });

        for(Student s : list){
            System.out.println(s.getName() + ":" + s.getCgpa());
        }
    }
}
