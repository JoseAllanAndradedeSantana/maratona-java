package curso_java.introducao;

public class EstruturaRepeticao01 {
    public static void main(String[] args) {
        // while DoWhile for
        int contador = 1;
        while (contador <= 10){
            System.out.println(contador);
            contador++;
        }

        do {
            System.out.println("Dentro do-while");
        }while (contador <=10);

        for(int i=0; i <= 10; i++){
            System.out.println("For "+ i);
        }

    }
}
