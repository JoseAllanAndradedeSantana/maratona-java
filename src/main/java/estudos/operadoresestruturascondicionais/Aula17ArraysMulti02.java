package estudos.operadoresestruturascondicionais;

public class Aula17ArraysMulti02 {
    public static void main(String[] args) {
        int a = 10;

        for(int i = 1; i <= a ; i++ ){
            for (int j =1 ; j <= a; j++){
                int resul = i*j;
                System.out.println(" "+ i + "X" +j + " = "+resul );
            }
        }

    }
}
