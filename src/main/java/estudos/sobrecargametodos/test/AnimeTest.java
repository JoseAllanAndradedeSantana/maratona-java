package estudos.sobrecargametodos.test;

import estudos.sobrecargametodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Allan","TV",10,"Acao");
        anime.imprime();
    }
}
