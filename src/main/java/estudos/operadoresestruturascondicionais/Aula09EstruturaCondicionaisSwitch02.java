package estudos.operadoresestruturascondicionais;

public class Aula09EstruturaCondicionaisSwitch02 {
    public static void main(String[] args) {
        byte dia = 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }
    }
}
