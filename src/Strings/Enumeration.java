package Strings;

public class Enumeration {
    public static void main(String[] args) {
        enum WeekDay {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        WeekDay tommorow = WeekDay.MONDAY;

        System.out.println("Today is: " + tommorow);
    }
}
