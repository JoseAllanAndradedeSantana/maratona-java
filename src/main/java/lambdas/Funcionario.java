package lambdas;

public class Funcionario {
	
	private String name;
	private int wage;
	
	
	public Funcionario() {
		super();
	}
	
	
	public Funcionario(String name, int wage) {
		super();
		this.name = name;
		this.wage = wage;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}


	@Override
	public String toString() {
		return "Funcionario [name=" + name + ", wage=" + wage + ", getName()=" + getName() + ", getWage()=" + getWage()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
