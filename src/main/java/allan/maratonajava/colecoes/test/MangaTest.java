package allan.maratonajava.colecoes.test;

import allan.maratonajava.colecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MangaTest {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L,"BHellsing",19.9));
        mangas.add(new Manga(2L,"CHellsing",29.9));
        mangas.add(new Manga(3L,"AHellsing",39.9));
        mangas.add(new Manga(4L,"DHellsing",49.9));
        mangas.add(new Manga(5L,"FHellsing",59.9));
        mangas.add(new Manga(6L,"EHellsing",69.9));

        Collections.sort(mangas);

        mangas.stream().forEach(System.out::println);
    }
}
