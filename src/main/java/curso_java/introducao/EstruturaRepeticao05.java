package curso_java.introducao;

public class EstruturaRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 40000;
        for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela :" + valorParcela);

        }
    }
}
