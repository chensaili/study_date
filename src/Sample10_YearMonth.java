import java.time.Month;
import java.time.YearMonth;

public class Sample10_YearMonth {
    public static void main(String[] args) {
        YearMonth currentYearMonth=YearMonth.now();
        System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth());
        YearMonth creditCardExpiry = YearMonth.of(2019, Month.FEBRUARY);
        System.out.printf("Your credit card expires on %s %n", creditCardExpiry);
    }
}
