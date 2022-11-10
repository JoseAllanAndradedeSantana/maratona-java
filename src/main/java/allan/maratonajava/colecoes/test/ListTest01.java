package allan.maratonajava.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>();
        nomes.add("José Allan");
        nomes.add("Andrade de Santana");

        for (String nome:nomes) {
            System.out.println(nome);
        }

        for (int i =0 ; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

    }



}
