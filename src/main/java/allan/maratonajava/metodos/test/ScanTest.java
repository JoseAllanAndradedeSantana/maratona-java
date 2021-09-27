package allan.maratonajava.metodos.test;

import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Digite seu nome :");
        String nome = en.nextLine();
        System.out.println("Digite seu SobreNome");
        String sobreNome = en.nextLine();
        System.out.println("Nome :" + nome + " " + sobreNome);
    }
}
