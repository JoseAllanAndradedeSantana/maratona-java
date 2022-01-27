package estudos.operadores;

public class Aula06EstruturaCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Não tenho condicao , mas vou ter";
        String result = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(result);
    }
}
