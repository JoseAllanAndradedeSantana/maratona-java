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
		String sql = "SELECT * FROM tb_produtos";

		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Produto> produtos = new ArrayList<>();
		
		while(resultado.next()) {
			Long codigo = resultado.getLong("codigoDeBarras");
			String nome = resultado.getString("nome");
			double preco = resultado.getDouble("preco");
			
			produtos.add(new Produto(codigo,nome,preco));
			
		}
		for (Produto produto : produtos) {
			System.out.println(produto.getCodigo()+" - " +produto.getNome()+" R$ "+ produto.getPreco());
			
		}
		
		produtos
				.stream()
				.filter(p -> p.getPreco() > 0)
				.map(Produto::getNome)
				.forEach(System.out::println);
		conexao.close();
	}
}
