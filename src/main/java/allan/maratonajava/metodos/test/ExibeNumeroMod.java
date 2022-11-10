package allan.maratonajava.metodos.test;

public class ExibeNumeroMod {
    public static void main(String[] args) {
        int numero = 0;
        for (int i = 0; i <= 100 ; i++) {
            int resto = numero % 2;
            if(resto == 1) {
                System.out.println(numero +" Impar");
            } else {
                System.out.println(numero +" Par");
            }
            numero++;
        }
    }
}
