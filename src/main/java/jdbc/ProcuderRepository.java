package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProcuderRepository {
    public static void save(Procuder procuder) {
        String sql = String.format("INSERT INTO `anime_store`.`procuder` (`name`) VALUES ('%s');", procuder.getName());
        String sql2 = String.format("UPDATE `anime_store`.`procuder` SET `name` = '%s' WHERE (`idprocuder` = '2');", procuder.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
