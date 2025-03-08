import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeClass {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        int hour = now.getHour();
        System.out.println(hour);

        String timeInString = "15:30:45";
        LocalTime parse = LocalTime.parse(timeInString);

    }
}
