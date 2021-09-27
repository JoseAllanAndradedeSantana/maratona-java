package allan.maratonajava.introducao;

public class Aula13Arrays01 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0] = 31;
        idades[1] = 29;
        idades[2] = 30;
        System.out.println(idades[0]);

        String nomes [] = new String[2];
        nomes[0] = "José";
        nomes[1] = "Allan";

        for (int i =0; i<2;i++){
            System.out.println(nomes[i]);
        }
    }
}
