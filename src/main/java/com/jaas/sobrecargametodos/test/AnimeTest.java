package com.jaas.sobrecargametodos.test;

import com.jaas.sobrecargametodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args){
        Anime anime = new Anime();
        anime.init("Jose","Allan",32);
        anime.imprime();
    }
}
