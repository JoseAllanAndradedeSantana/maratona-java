package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Allan", 10.0);
		Aluno a2 = new Aluno("Jose", 9.0);
		Aluno a3 = new Aluno("AllanJose", 8.0);
		Aluno a4 = new Aluno("AllanSantana", 7.0);
		Aluno a5 = new Aluno("AllanAndrade", 9.0);
		Aluno a6 = new Aluno("AllanAllan", 8.0);
		Aluno a7 = new Aluno("Allan2", 5.0);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7);
		Predicate<Aluno> aprovado = nota -> nota.nota >= 7;
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(aprovado));
		alunos.stream().filter(a -> a.nota > 7).map(a -> a.nome).forEach(System.out::println);

	}

}
