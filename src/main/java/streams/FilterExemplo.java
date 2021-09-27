package streams;

import java.util.Arrays;
import java.util.List;

public class FilterExemplo {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Allan2", 10.0);
		Aluno a2 = new Aluno("Jose", 9.0);
		Aluno a3 = new Aluno("AllanJose", 8.0);
		Aluno a4 = new Aluno("AllanSantana", 7.0);
		Aluno a5 = new Aluno("AllanAndrade", 9.0);
		Aluno a6 = new Aluno("AllanAllan", 8.0);
		Aluno a7 = new Aluno("Allan2", 5.0);
		
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7);
		
		alunos.stream().filter(a -> a.nota > 7 && a.nome.equals("Allan")).map(a -> a.nome).forEach(System.out::println);

	}
	
	

}
