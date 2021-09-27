package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		
		String stringDeConexao = "com.mysql.cj.jdbc.Driver://localhost";
		String url = "jdbc:mysql://localhost:3306/exames?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "1234";		
		Connection connection = DriverManager.getConnection(url, usuario, senha);
		System.out.println(url);
		System.out.println("Usuário: "+usuario);
		System.out.println(senha);
		
		System.out.println("Conexão efetuada com sucesso");
		connection.close();
	}

}
