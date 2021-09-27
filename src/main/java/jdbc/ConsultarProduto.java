package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarProduto {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM produto";

		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Produto> produtos = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			double preco = resultado.getDouble("preco");
			
			produtos.add(new Produto(codigo,nome,preco));
			
		}
		for (Produto produto : produtos) {
			System.out.println(produto.getCodigo()+" - " +produto.getNome()+" R$"+ produto.getPreco());
			
		}
		
		produtos.stream().filter(p -> p.getCodigo() > 0).forEach(System.out::println);
		conexao.close();
	}
}
