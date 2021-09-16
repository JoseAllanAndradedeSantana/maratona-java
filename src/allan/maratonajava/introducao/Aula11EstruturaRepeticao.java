package allan.maratonajava.introducao;

public class Aula11EstruturaRepeticao {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 38000;

        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela >= 1000){
                System.out.println(parcela +" Parcelas " +  "R$ " + valorParcela);
            }else{
                break;
            }
        }
    }
}
