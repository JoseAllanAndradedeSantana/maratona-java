package curso_java.introducao;

public class EstruturaCondicionais {
    public static void main(String[] args) {
        int idade = 32;
        boolean isAutorizado = idade >= 18;
        if(isAutorizado){
            System.out.println("Autorizado a comprar Bebida!!");
        }
        System.out.println("FORA DO IF");
    }
}
