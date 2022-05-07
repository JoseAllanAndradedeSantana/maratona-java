package estudos.operadoresestruturascondicionais;

public class Aula13Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 32;
        idades[1] = 28;
        idades[2] = 13;

        System.out.println("Endereco em memoria "+idades);

        for (int i = 0; i <3 ; i++) {
            System.out.println(idades[i]);

        }
    }
}
