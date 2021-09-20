package regex;

public class CnpjTest {
    public static void main(String[] args) {
        Cnpj c = new Cnpj("00.000.000/0000-00");
        c.validarCnpj();
    }
}
