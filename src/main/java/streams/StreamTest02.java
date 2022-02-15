package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    public static void main(String[] args) {
        List<String> words = List.of("Allan","Mariane","Isaac","Manuella");
        List<String> collect = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
