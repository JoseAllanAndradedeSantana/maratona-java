package estudos.operadores;

public class Aula02OperadoresRelacionais {
    //% < > <= >= == !=
    public static void main(String[] args) {
        int num1 = 22;
        int num2 = 7;
        int result = num1 % num2;
        System.out.println(result);
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteDez);
    }
}
