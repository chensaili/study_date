import java.time.Instant;
import java.util.Date;

public class Sample12_Instant {
    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        System.out.println("What is value of this instant " + timestamp.toString());
        System.out.println("What is value of this instant " + timestamp.toEpochMilli());

        Date date=new Date();
        System.out.println(date.toString());
    }
}
