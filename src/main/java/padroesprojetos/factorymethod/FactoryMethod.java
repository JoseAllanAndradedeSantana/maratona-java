package padroesprojetos.factorymethod;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

public class FactoryMethod {

    // Virtual Constructor

    public static void main(String[] args) {
        //Static Factory Methods
        Calendar.getInstance();
        NumberFormat.getInstance();
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        List<Integer> integers = List.of(1, 2, 3, 4);
        Integer integer = Integer.valueOf("1234");
        System.out.println(integer);
        System.out.println(integerStream);
        for (Integer s : integers) {
            System.out.println(s);
        }
    }
}
