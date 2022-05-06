package estudoparacertificacao.estruturascondicionais;

public class EstruturasCondicionais01 {
    public static void main(String[] args){
        int age = 17;
        boolean isAutorizado = age >= 18;
        if(isAutorizado){
            System.out.println("Liberado para Compra de bebidas Alcoolicas!!");
        }else{
            System.out.println("Proibido para menores que 18 anos");

        }
    }
}
