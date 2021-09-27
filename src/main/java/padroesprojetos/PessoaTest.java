package padroesprojetos;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder()
                .firstName("Allan")
                .latsName("Santana")
                .userName("AllanSantana")
                .email("allan_santana_devjava@hotmail.com")
                .build();

        System.out.println(p);

    }
}
