package estudos.associacao.test;

import estudos.associacao.domain.Jogador;
import estudos.associacao.domain.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Allan");
        Time time = new Time("Santos");
        jogador.setTime(time);
        jogador.imprime();

    }
}
