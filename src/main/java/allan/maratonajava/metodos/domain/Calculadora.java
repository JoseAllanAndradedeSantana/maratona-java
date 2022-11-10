package allan.maratonajava.metodos.domain;

public class Calculadora {
    public void somarDoisNumeros() {
        System.out.println(10 + 3);
    }

    public double somaDoisNumeros(Double num1, Double num2){
        Double num = 3d;
        return (num1 + num2) * num;
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
