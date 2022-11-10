package string.test;

public class StringTest03 {
    public static void main(String[] args) {
        long inicio =  System.currentTimeMillis();
        concat(10000);
        long fim = System.currentTimeMillis();
        System.out.println("Sistema rodou em "+ (fim - inicio) +" ms");

    }

    private static void concat(int tamanho){
        String texto = "";
        for (int i = 0; i <= tamanho; i++) {
            texto += i;
        }
    }
}
