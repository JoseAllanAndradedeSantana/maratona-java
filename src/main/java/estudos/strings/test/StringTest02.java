package estudos.strings.test;

public class StringTest02 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10);
        long fim = System.currentTimeMillis();
        System.out.println(fim-inicio);

    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho ; i++) {
            texto += i;
            System.out.println(texto);

        }
    }
}
