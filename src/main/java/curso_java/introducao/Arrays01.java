package curso_java.introducao;

import java.sql.Array;

public class Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 32;
        idades[1] = 30;
        idades[2] = 1;
        System.out.println(idades.length);
        int[] array = {1,2,3,4,5};
        System.out.println(soma(array));

    }

    private static int soma(int[] nums){
        int result = 0;
        for(int aux : nums){
            result += aux;
        }
        return result;
    }
}
