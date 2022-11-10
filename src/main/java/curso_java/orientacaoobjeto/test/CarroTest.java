package curso_java.orientacaoobjeto.test;

import curso_java.orientacaoobjeto.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.nome = "Fox Branco";
        c1.modelo = "Completo";
        c1.ano = 2015;

        c2.nome = "Fox Preto";
        c2.modelo = "Basico";
        c2.ano = 2008;


    }
}
