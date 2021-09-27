package allan.maratonajava.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Allan");
        nomes.add("Deus");
        nomes.add("Bom");
        nomes.add("Jesus Cristo");

        Collections.sort(nomes);

        for (String nome:nomes) {
            System.out.println(nome);

        }

    }
}
