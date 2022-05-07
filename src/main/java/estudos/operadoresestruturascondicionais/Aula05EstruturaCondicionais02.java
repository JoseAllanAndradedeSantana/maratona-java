package estudos.operadoresestruturascondicionais;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        int age = 18;
        if(age < 15){
            System.out.println("Infantil");
        } else if(age >= 15 && age < 18){
            System.out.println("Juvenil");
        }else {
            System.out.println("Adulto");
        }
    }
}
