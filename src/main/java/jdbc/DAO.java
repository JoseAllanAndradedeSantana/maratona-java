package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class DAO {
	
	private Connection conexao;
	
	private Connection getConexao() throws SQLException {
		try {
			if(conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		conexao = FabricaConexao.getConexao();
		return conexao;
	}

}
