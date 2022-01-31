package estudos.associacao.test;

import estudos.associacao.domain.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Allan");
        Jogador jogador2 = new Jogador("Jose");
        Jogador[] jogadores = {jogador1,jogador2};
        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
