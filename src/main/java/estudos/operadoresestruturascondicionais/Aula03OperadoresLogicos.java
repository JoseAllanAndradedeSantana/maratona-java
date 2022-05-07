package estudos.operadoresestruturascondicionais;

public class Aula03OperadoresLogicos {
    // AND && OR || NOT !
    public static void main(String[] args) {
        int age = 32;
        double salario = 3000;
        boolean isDentroLei = age > 35 && salario > 4612;
        System.out.println(isDentroLei);

        double valorContaCorrente = 5000;
        double valorContaPoupanca = 15000;
        double valorPlaystation = 5000;
        boolean isPlaystationCompravel = valorContaCorrente > valorPlaystation || valorContaPoupanca > valorPlaystation;
        System.out.println(isPlaystationCompravel);

        double bonus = 1000;
        bonus += 1;
        System.out.println(bonus);
    }
}
