package enums;

public enum TipoCliente {
    PESSOA_FISICA("Pessoa Fisica"),
    PESSOA_JURIDICA("Pessoa Jurica");

   private final String tipo;

    TipoCliente(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
