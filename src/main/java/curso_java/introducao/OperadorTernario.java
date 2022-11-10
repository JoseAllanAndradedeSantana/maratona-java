package curso_java.introducao;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 6000;
        String msgDoar = "Eu vou doar";
        String msgNaoDoar = "Ainda não tenho condicoes, mas vou ter";
        String result = salario > 5000 ? msgDoar : msgNaoDoar;
        System.out.println(result);
    }
}
