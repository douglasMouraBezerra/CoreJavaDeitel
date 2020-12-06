package deitelCapitulo7.examples.gradebookArrayMult;

public class GradeBookArrayMulti {

	private String nomeCurso;
	private int[][] notas;

	public GradeBookArrayMulti(String nomeCurso, int[][] notas) {
		setNomeCurso(nomeCurso);
		this.notas = notas;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	private int getMenorNota() {
		int menorNota = this.notas[0][0];

		// percorre so as linhas do array notas
		for (int[] studentGrades : notas) {

			for (int nota : studentGrades)
				if (nota < menorNota)
					menorNota = nota;

		}

		return menorNota;

	}

	// podemos modificar para trabalhar com for aprimorado
	private int getMaiorNota() {
		int maiorNota = this.notas[0][0];

		// atribui uma linha ao array unidimensional studentGrades
		for (int[] studentGrades : notas) {
			// percorre a "linha" atribui cada elemento da linha a grade e depois compara
			for (int grade : studentGrades)
				if (grade > maiorNota)
					maiorNota = grade;
		}

		return maiorNota;

	}

	/**
	 * Metodo retorna a media de cada aluno
	 * 
	 * @param notasAluno
	 * @return
	 */
	private double getMedia(int[] notasAluno) {
		int total = 0;

		for (int nota : notasAluno)
			total += nota;

		return (double) total / notasAluno.length;
	}

	private void geraGraficoBarchart() {
		System.out.println("Distribuicao de notas no geral: ");

		int[] frequencia = new int[11];

		// mesma logica dos metods maior e menor nota
		for (int[] notasEstudante : this.notas) {
			for (int nota : notasEstudante)
				++frequencia[nota / 10];
		}

		// para cada frequencia imprime a qtd adequada de asteriscos
		for (int count = 0; count < frequencia.length; count++) {
			if (count == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d - %02d: ", count * 10, count * 10 + 9);

			for (int estrelas = 0; estrelas < frequencia[count]; estrelas++)
				System.out.print("*");

			System.out.println();

		}
	}

	private void saidaDasNotas() {
		System.out.printf("The grades are: %n%n");
		System.out.print("		");

		for (int test = 0; test < notas[0].length; test++)
			System.out.printf("Teste %d ", test + 1);

		System.out.println("Media");
		for (int estudante = 0; estudante < notas.length; estudante++) {
			System.out.printf("Estudante %2d", estudante + 1);

			for (int teste : notas[estudante])
				System.out.printf("%8d", teste);

			double average = getMedia(notas[estudante]);
			System.out.printf("%9.2f%n", average);

		}

	}

	public void processaNotas() {
		saidaDasNotas();

		System.out.printf("%n%s %d%n%s %d%n%n", "Menor nota e: ", getMenorNota(), "Maior nota e: ", getMaiorNota());
		geraGraficoBarchart();

	}

}
