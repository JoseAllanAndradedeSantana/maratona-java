package exception.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        int divisao = divisao(5, 0);
        System.out.println(divisao);

    }

    private static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Error Divisao por "+b);
        }
        return a/b;
    }
}
