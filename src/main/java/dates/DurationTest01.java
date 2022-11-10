package dates;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime meet = LocalDateTime.of(2016,Month.SEPTEMBER,12,17,30);
        Duration time = Duration.between(meet,now);
        System.out.println(time);
    }
}
