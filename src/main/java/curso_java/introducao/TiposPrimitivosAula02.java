package curso_java.introducao;

import java.time.LocalDateTime;
import java.util.Scanner;

public class TiposPrimitivosAula02 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        String nome;
        String endereco;
        Double salario;
        LocalDateTime data;

        System.out.println("Digite seu Nome:");
        nome = en.nextLine();

        System.out.println("Digite seu Endereço:");
        endereco = en.nextLine();

        System.out.println("Digite seu Salario:");
        salario = en.nextDouble();

        data = LocalDateTime.now();

        String msg = String.format("Eu %s, moro na rua: %s, e o meu Salario: %s, na data: %s",nome,endereco,salario,data);

        System.out.println(msg);

        en.close();
    }
}
