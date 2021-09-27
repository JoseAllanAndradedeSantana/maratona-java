package allan.maratonajava.introducao;

public class Aula06Estrutura {

    public static void main(String[] args) {
        int idade = 16;

        if (idade < 15){
            System.out.println("Categoria Infatil");
        }else if(idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria Adulto");
        }
    }
}
