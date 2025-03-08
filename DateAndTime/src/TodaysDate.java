import java.time.LocalDate;
import java.time.Month;

public class TodaysDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        //custom date
        LocalDate customeDate = LocalDate.of(1990, 2, 7);

        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int monthValue = now.getMonthValue();
        int year = now.getYear();
        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(monthValue);
        System.out.println(year);


    }
}
