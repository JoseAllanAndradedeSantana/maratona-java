package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class QueryAlterar {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner en = new Scanner(System.in);
		System.out.println("Informe o codigo do Produto: ");
		int codigo = en.nextInt();
		
		String sql = "SELECT codigoDeBarras, nome FROM tb_produtos WHERE codigoDeBarras = ?";
		
		
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		ResultSet r = stmt.executeQuery();
		
		if(r.next()) {
			stmt.setInt(1, codigo);
			Produto produto;
		}
		conexao.close();
		en.close();
	}

}
