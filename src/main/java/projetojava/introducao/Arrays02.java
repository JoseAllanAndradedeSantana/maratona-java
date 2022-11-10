package projetojava.introducao;

public class Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Jose Allan";
        nomes[1] = "Mariane";
        nomes[2] = "Isaac";

        for (int i = 0; i < nomes.length;i++){
            System.out.println(nomes[i]);
        }
    }
}
