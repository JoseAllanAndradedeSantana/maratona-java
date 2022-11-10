package allan.maratonajava.introducao;

public class Aula03TiposPrimitivos {

    public static void main(String[] args) {

        String nome = "José Allan Andrade de Santana";
        String cargo = "Desenvolvedor Java";
        String end = "Americo Vespucio";
        double salario = 3500;
        String dataRecebimentoSalario = "20/12/2021";
        String msg = String.format("Nome:%s \nCargo:%s \nEndereço: %s \nSalario:%.2f \nData de Pagamento: %s", nome,cargo,end,salario,dataRecebimentoSalario);
        System.out.println(nome+" "+cargo+" "+end+" "+salario+" "+ dataRecebimentoSalario);
        System.out.println(msg);

    }


}
