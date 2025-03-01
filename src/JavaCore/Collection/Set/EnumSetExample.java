package JavaCore.Collection.Set;


import java.util.EnumSet;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumSetExample {
    public static void main(String[] args) {

        //* Create an EnumSet containing specific days
        EnumSet<Day> days= EnumSet.of(Day.MONDAY,Day.TUESDAY, Day.WEDNESDAY,Day.THURSDAY,Day.FRIDAY,Day.SATURDAY);
        System.out.println("Day: "+days);
        //Output: Day: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY]


        //* Create an EnumSet containing all Day
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All Days: "+allDays);
        //Output: All Days: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]


        //* Create an EmptySet
        EnumSet<Day> emptySet= EnumSet.noneOf(Day.class);
        System.out.println("Empty Set: "+emptySet);   //[]\

        //Adding at Emptyset
        emptySet.add(Day.SATURDAY);
        emptySet.add(Day.SUNDAY);
        System.out.println("After Adding in Empty Set: "+emptySet);   // [SATURDAY, SUNDAY]

        //Remove
        days.remove(Day.FRIDAY);
        System.out.println("After Removing Friday: "+days);
        // Output: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, SATURDAY]
    }
}
