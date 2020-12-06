package deitelCapitulo7.examples.gradebook;

public class GradeBookTest {

	public static void main(String[] args) {

		int[] notas = { 0,10, 20, 30, 40, 50, 50, 50, 60, 80, 80, 80, 80, 80, 80, 90, 90, 95, 96, 30, 35, 70, 75, 74, 72,
				70, 100, 100, 100, 100, 100, 10, 10, 10, 10};

		GradeBook gradeBook = new GradeBook("Estrutura de Dados", notas);

		System.out.printf("Welcome to the grade book %s%n", gradeBook.getNomeCurso());

		gradeBook.processaNotas();

	}

}
