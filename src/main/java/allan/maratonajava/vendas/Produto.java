package allan.maratonajava.vendas;

public class Produto {
	
	private Long id;
	private Long codigoBarras;
	private Long codigoRapido;
	private String nome;
	private double precoDeCusto;
	private double precoDeVenda;
	
	
	
	public Produto() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(Long codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public Long getCodigoRapido() {
		return codigoRapido;
	}
	public void setCodigoRapido(Long codigoRapido) {
		this.codigoRapido = codigoRapido;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoDeCusto() {
		return precoDeCusto;
	}
	public void setPrecoDeCusto(double precoDeCusto) {
		this.precoDeCusto = precoDeCusto;
	}
	public double getPrecoDeVenda() {
		return precoDeVenda;
	}
	public void setPrecoDeVenda(double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}	
	

}
