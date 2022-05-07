package estudos.operadoresestruturascondicionais;

public class Aula04EstruturaCondicionais {
    public static void main(String[] args) {
        int age = 18;
        if(age >= 18){
            System.out.println("Liberado para compra");
        }

        boolean isAutorizado = age < 17;
        if(!isAutorizado){
            System.out.println("If negacao !!!");
        }
    }
}
