package curso_java.introducao;

public class Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int soma = num1 + num2;
        int mult = num1 * num2;
        int div = num2 / num1;
        int sub = num2 - num1;
        int resto = 20 % 2;

        String rel = String.format(" Soma: %s \n Multiplicacao: %s \n Divisao: %s \n Subtracao: %s", soma, mult, div, sub);
        System.out.println(rel);
    }
}
