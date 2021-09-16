package exception;

@SuppressWarnings("serial")
public class NumerosNegativos extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public NumerosNegativos(String nomeDoAtributo) {
		
		this.nomeDoAtributo = nomeDoAtributo;
		
	}
	
	@Override
	public String getMessage() {
		
		return String.format("%s", nomeDoAtributo);
	}

}
