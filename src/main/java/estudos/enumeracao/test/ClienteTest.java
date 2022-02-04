package estudos.enumeracao.test;

import estudos.enumeracao.domain.Cliente;
import estudos.enumeracao.domain.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Allan", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente);
    }
}
