package estudos.introducaoclasse.test;

import estudos.introducaoclasse.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carroFusca = new Carro();
        Carro carroMustang = new Carro();

        carroFusca.nome = "Fusca";
        carroFusca.modelo = "Sport";
        carroFusca.ano = 1969;

        carroMustang.nome = "Mustang";
        carroMustang.modelo = "GT-500";
        carroMustang.ano = 1968;

        System.out.println(carroFusca.nome);
        System.out.println(carroFusca.modelo);
        System.out.println(carroFusca.ano);

        System.out.println("\n");
        System.out.println(carroMustang.nome);
        System.out.println(carroMustang.modelo);
        System.out.println(carroMustang.ano);
    }
}
