package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce02 {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Allan", 9.5);
		Aluno aluno2 = new Aluno("AllanAllan", 9.5);
		Aluno aluno3 = new Aluno("AllanJose", 8.5);
		Aluno aluno4 = new Aluno("AllanAndrade", 9.5);
		Aluno aluno5 = new Aluno("AllanSantana", 6.5);

		List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> nota = n -> n.nota;
		BinaryOperator<Double> somatorio = (a, b) -> a + b;

		alunos.stream().filter(aprovado).map(nota).reduce(somatorio).ifPresent(System.out::println);
	}

}
