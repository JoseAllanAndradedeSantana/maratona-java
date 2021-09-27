package jdbc;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
      //  ConnectionFactory.getConnection();
        Procuder p = new Procuder("Isaac Santana da Silva Andrade");
        ProcuderRepository.save(p);
    }
}
