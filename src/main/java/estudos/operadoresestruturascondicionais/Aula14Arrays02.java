package estudos.operadoresestruturascondicionais;

public class Aula14Arrays02 {
    public static void main(String[] args) {
        //byte, short , int, long , float, double =0
        //char u000 ''
        //boolean false
        //String null

        String[] nomes = new String[4];
        nomes[0] = "Allan";
        nomes[1] = "Mariane";
        nomes[2] = "Isaac";
        nomes[3] = "Manuella";

        for(int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);

        }
    }
}
