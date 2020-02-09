import java.time.LocalTime;

public class Sample6_LocalTime {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        LocalTime newTime=time.plusHours(3);
        System.out.println("三个小时后的时间为："+newTime);
    }
}
