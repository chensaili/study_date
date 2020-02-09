import java.time.LocalDate;

public class Sample3_LocalDate {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2020,2,9);
        System.out.println("自定义日期："+date);
        //判断两个日期是否相等
        LocalDate today=LocalDate.now();
        if(date.equals(today)){
            System.out.println("是同一天吗？yes");
        }else {
            System.out.println("是同一天吗？no");
        }
    }
}
