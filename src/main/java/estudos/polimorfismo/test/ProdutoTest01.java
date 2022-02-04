package estudos.polimorfismo.test;

import estudos.polimorfismo.domain.Computador;
import estudos.polimorfismo.service.CalculaImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Samsung", 4000);
        Computador computador1 =  new Computador("MAC PRO",10000);
        Computador[] computadores = {computador,computador1};
        CalculaImposto.calculaImposto(computador);
        CalculaImposto.calculaImposto(computador1);
    }
}
