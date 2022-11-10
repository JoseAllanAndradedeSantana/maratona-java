package dates;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        LocalTime time = LocalTime.of(11,16,50);
        System.out.println(lt);
        System.out.println(time);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
    }
}
