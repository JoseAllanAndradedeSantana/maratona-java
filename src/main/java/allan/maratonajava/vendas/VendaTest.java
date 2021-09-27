package allan.maratonajava.vendas;

public class VendaTest {
	public static void main(String[] args) {
		Produto produto = new Produto();
		CupomFiscal cupomFiscal = new CupomFiscal();
		produto.setNome("Coca Cola 350ml");
		cupomFiscal.impressaoCupom(produto);
	}

}
