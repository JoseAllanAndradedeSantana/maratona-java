package curso_java.introducao;

public class Switch02 {
    public static void main(String[] args) {
        int dia = 7;
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
                System.out.println("Dia Invalido");
                break;
        }
    }
}
