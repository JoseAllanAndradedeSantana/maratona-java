package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    //JAVA.SQL = CONNECTION, STATEMENT, RESULTSET, DRIVERMANAGER

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3308/anime_store";
        String userName = "root";
        String password = "root";
        return DriverManager.getConnection(url, userName, password);

    }
}
