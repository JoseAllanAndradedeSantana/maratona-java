package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	public static Connection getConexao() throws SQLException {
		String stringDeConexao = "com.mysql.cj.jdbc.Driver://localhost";
		String url = "jdbc:mysql://localhost:3306/exames?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "1234";		
		return DriverManager.getConnection(url, usuario, senha);
	}


	public static String conexao() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/exames?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "1234";
		Connection connection = DriverManager.getConnection(url, usuario, senha);
		return connection.toString();
	}

	public static void main(String[] args) throws SQLException {

		System.out.println(FabricaConexao.conexao());
	}
}
