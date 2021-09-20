package dates;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
    }
}
