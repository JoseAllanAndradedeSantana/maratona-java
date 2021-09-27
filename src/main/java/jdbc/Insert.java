package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) throws SQLException {
		Scanner en = new Scanner(System.in);
		System.out.println("Cadastrar Produto:");

		String nome = en.nextLine();
		System.out.println("Cadastrar Preço:");
		int preco = en.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();

		String sql = "INSERT INTO produto (nome, preco) VALUES (?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.setInt(2, preco);
		System.out.println(sql);

		System.out.println(nome);
		stmt.execute();
		en.close();
	}

}
