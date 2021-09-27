package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarProduto2 {

	public static void main(String[] args) throws SQLException {
		Scanner en = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM produto WHERE nome like?;";

		System.out.println("====================================");
		String p = en.nextLine();
		System.out.println(p);
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + p + "%");
		System.out.println(stmt);
		ResultSet resultado = stmt.executeQuery(sql);

		List<Produto> produtos = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			double preco = resultado.getDouble("preco");

			produtos.add(new Produto(codigo, nome, preco));

		}
		for (Produto produto : produtos) {
			System.out.println(produto.getCodigo() + " - " + produto.getNome() + " R$" + produto.getPreco());

		}

		// produtos.stream().filter(p -> p.getId() > 0).forEach(System.out::println);
		conexao.close();

		en.close();
	}

}
