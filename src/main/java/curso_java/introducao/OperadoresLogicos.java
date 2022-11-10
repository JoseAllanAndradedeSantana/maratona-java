package curso_java.introducao;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // AND OR XOR NOT     && || ^ !
        int idade = 32;
        double salario = 3500;

        boolean isFeliz = idade >= 30 && salario >= 3000;
        boolean isTriste = idade >= 30 && salario < 1000;

        System.out.println(isFeliz);
        System.out.println(isTriste);

    }
}
