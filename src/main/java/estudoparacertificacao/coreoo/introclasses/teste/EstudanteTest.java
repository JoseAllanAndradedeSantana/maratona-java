package estudoparacertificacao.coreoo.introclasses.teste;

import estudoparacertificacao.coreoo.introclasses.domain.Estudante;

import java.time.OffsetDateTime;

public class EstudanteTest {
       public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Allan");
        estudante.setIdade(32);
        estudante.setCurso("Engenharia da computacao");
        estudante.setRa("28");
        estudante.setDatacadastro(OffsetDateTime.now());
        System.out.println(estudante);


    }
}
