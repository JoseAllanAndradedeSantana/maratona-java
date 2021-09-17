package enums;

public enum TipoPagamento {
    CREDITO("Credito"),
    DEBITO("Debito"){
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.20;
        }
    },
    CONVENIO("Convênio"),
    PIX("Pix");

    private final String descricao;

    TipoPagamento(String descricao) {
        this.descricao = descricao;
    }

    public double calcularDesconto(double valor){
        return 0;
    }
}
