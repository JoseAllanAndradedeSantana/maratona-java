package jdbc;

import java.sql.SQLException;

public class ConnectionFactoryTest {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory.getConnection();
        Procuder p = new Procuder("Isaac Santana da Silva Andrade");
        ProcuderRepository.save(p);
    }
}
