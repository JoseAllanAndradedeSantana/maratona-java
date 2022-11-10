package curso_java.orientacaoobjeto.introducaometodos.domain;

public class Calculadora {
    public void soma(){
        System.out.println(10+20);
    }

    public void multiplica(int num1,int num2){
        int resul = num1 * num2;
        String msg = String.format("Multiplica: %s x %s = %s",num1,num2,resul);
        System.out.println(msg);
    }
}
