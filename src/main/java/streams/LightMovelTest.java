package streams;

import java.util.Comparator;
import java.util.List;

public class LightMovelTest {
    private static List<LightNovel> list = List.of(
            new LightNovel("Allan",3.00),
            new LightNovel("Mariane",4.00),
            new LightNovel("Isaac",10.00),
            new LightNovel("Manuella",1.00));

    public static void main(String[] args) {
        list.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(p -> p.getPrice() <= 10)
                .map(lightNovel -> lightNovel.getTitle())
                .forEach(System.out::println);
    }
}
