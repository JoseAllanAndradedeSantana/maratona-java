package eenum;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("JAAS SOFTWARE E CONSULTORIA ",TipoCliente.PESSOA_JURIDICA,TipoPagamento.CONVENIO);
        Cliente cliente2 = new Cliente("José Allan Andrade de Santana ",TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);
        System.out.println(cliente.getTipoCliente());
        System.out.println(cliente2.getTipoPagamento().calcularDesconto(800));
    }
}
