import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sample13_LocalDate {
    public static void main(String[] args) {
        String dayAfterTommorrow = "20200209";
        LocalDate formatted = LocalDate.parse(dayAfterTommorrow,
                DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(dayAfterTommorrow+"  格式化后的日期为:  "+formatted);
    }
}
