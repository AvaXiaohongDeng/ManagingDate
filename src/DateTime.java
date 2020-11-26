import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("\nToday is " + now);

        LocalDateTime next;

        //revise date
        next = now.withYear(2021);
        System.out.println("\nNext Year is " + next);

        //retrieve date seperately
        String lists = "\nYear:\t\t\t\t\t" + next.getYear();
        lists += "\nMonth:\t\t\t\t\t" + next.getMonth();
        lists += "\nMonth Number:\t\t\t" + next.getMonthValue();
        lists += "\nDay:\t\t\t\t\t" + next.getDayOfWeek();
        lists += "\nDay Number of Month:\t" + next.getDayOfMonth();
        lists += "\nDay Number of Year:\t\t" + next.getDayOfYear();
        lists += "\nHour(0-23):\t\t\t\t" + next.getHour();
        lists += "\nMinute:\t\t\t\t\t" + next.getMinute();
        lists += "\nSecond:\t\t\t\t\t" + next.getSecond();
        System.out.println(lists);
    }
}
