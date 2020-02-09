import java.time.LocalDate;
import java.time.MonthDay;

public class Sample4_LocalDate {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.now();
        LocalDate date2=LocalDate.of(2020,12,9);
        MonthDay birthday=MonthDay.of(date2.getMonth(),date2.getDayOfMonth());
        MonthDay currentMonthDay=MonthDay.from(date1);
        if(currentMonthDay.equals(birthday)){
            System.out.println("今天是"+currentMonthDay.toString()+"!生日快乐！");
        }else {
            System.out.println("今天是"+currentMonthDay.toString()+",不是你的生日！");
        }
    }
}
