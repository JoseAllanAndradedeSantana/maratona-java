package classesabstratas;

public class FuncionarioTeste {
    public static void main(String[] args) {
     //   Funcionario func = new Funcionario("José Allan",3500);
        Gerente ger = new Gerente("Allan Santana",7000);
     //   System.out.println(func);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Allan Santana",6500);
        System.out.println(ger);
        System.out.println(desenvolvedor);
    }
}
