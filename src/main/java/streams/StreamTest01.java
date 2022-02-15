package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest01 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> designers = List.of("teste1","teste2");
        List<String> developers = List.of("Allan","Andrade");
        list.add(designers);
        list.add(developers);
        list.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
