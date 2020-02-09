import java.time.LocalDate;

public class Sample2_LocalDate {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        int year=today.getYear();
        int month=today.getMonthValue();
        int day=today.getDayOfMonth();
        System.out.println("year:"+year);
        System.out.println("month:"+month);
        System.out.println("day:"+day);
    }
}
