package estudos.operadoresestruturascondicionais;

public class Aula16ArraysMulti01 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[1][0] = 31;
        dias[1][1] = 30;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        for (int base[]:dias) {
            for (int num:base){
                System.out.println(num);
            }
        }
    }
}
