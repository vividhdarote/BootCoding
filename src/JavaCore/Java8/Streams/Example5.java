package JavaCore.Java8.Streams;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name+"("+age+")";
    }
}

public class Example5 {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Dhoni", 42),
                new Person("Rohit", 37),
                new Person("Virat",37),
                new Person("Bumrah",31),
                new Person("Sachin",45));

        Map<Integer, List<Person>> collect = personList.stream().collect(Collectors.groupingBy(Person::getAge));
        Map<Integer, String> collect1= personList.stream().
                collect(Collectors.groupingBy(
                        Person::getAge,
                        Collectors.mapping(p->p.name,Collectors.joining(", "))
                ));
        System.out.println(collect);
        System.out.println(collect1);


        //Alternate implementation
        List<Person> people = Arrays.asList(
                new Person("Dhoni", 42),
                new Person("Rohit", 37),
                new Person("Virat",37),
                new Person("Bumrah",31),
                new Person("Sachin",45));

        Map<Integer,List<Person>> collecting = new HashMap<>();
        for(Person person: people){
            collecting.putIfAbsent(person.getAge(),new ArrayList<>());
            collecting.get(person.getAge()).add(person);
        }

        System.out.println(collecting);
    }
}
