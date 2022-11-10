package curso_java.introducao;

public class EstruturaCondicionais2 {
    public static void main(String[] args) {
        //< 15 infantil
        // >= 15 e < 18 juvenil
        // >=18 adulto
        int idade = 18;

        if(idade < 15){
            System.out.println("Categoria Infantil");
        }

        if(idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }

        if(idade >= 18){
            System.out.println("Categoria Adulto");
        }
    }
}
