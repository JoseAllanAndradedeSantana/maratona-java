package estudos.metodos.domain;

public class Calculadora {

    public void somaDoisNumeros(){
        int result = 10+10;
        System.out.println(result);
        System.out.println("Finalizando metodos de somar");
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        int result = num1 * num2;
        System.out.println(result);
    }

    public double divide(double num1, double num2){
        if(num2 == 0) return 0;
        return num1/num2;
    }
}
