import java.time.LocalDate;
import java.time.Period;
//计算当天和将来某一天之间的月数
public class Sample11_LocalDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate java8Release = LocalDate.of(2020, 8, 31);

        Period periodToNextJavaRelease = Period.between(today, java8Release);
        System.out.println("Months left between today and Java 8 release : "
                + periodToNextJavaRelease.getMonths());
    }
}
