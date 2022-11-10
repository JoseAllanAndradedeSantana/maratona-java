package curso_java.introducao;

public class TiposPrimitivosAula01 {
    public static void main(String[] args) {
        //int , double , float ,boolean . char, long,byte ,short
        int idade = 32;
        double salario = 4000;
        float salarioF = 3500;
        boolean verdadeiro = true;
        boolean falso = false;
        byte idadeByte = 32;
        short idadeShort = 32;
        char sexo = 'M';
        long salarioLong = 40000;
        String print = String.format("Sua idade: %s", idade);
        System.out.println(print);
    }
}
