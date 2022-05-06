package com.jaas.introducao;

public class Arrays2 {
    public static void main(String[] args){
        int[][] dias = new int[2][3];
        dias[0][0] = 31;
        dias[0][1] = 32;
        dias[0][2] = 33;

        dias[1][0] = 34;
        dias[1][1] = 35;
        dias[1][2] = 36;
        System.out.println(dias.length);

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        for (int[] arrayBase:dias) {
            for(int num : arrayBase){
                System.out.println(num);
            }
        }
    }
}
