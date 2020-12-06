package deitelCapitulo7.examples.gradebook;

public class GradeBook {

	private String nomeCurso;
	private int[] notas;

	public GradeBook(String nomeCurso, int[] notas) {
		setNomeCurso(nomeCurso);
		this.notas = notas;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void processaNotas() {
		saidaNotas(); // gera saida do array de notas
		System.out.printf("%nMedia da turma: %.2f%n", getMedia()); // exibe media

		// exibe a maior e a menor nota
		System.out.printf("Menor nota: %d%nMaior nota: %d%n", getMenorNota(), getMaiorNota());

		// imprime grafico de distribuicao de nota
		getGraficoBarChart();

	}

	// METODOS MEDIA,MAIOR,MENOR
	public double getMedia() {
		int total = 0;

		for (int i : notas)
			total += i;

		return (double) total / notas.length;

	}

	public int getMenorNota() {
		int menorNota = notas[0]; // supondo que elemento na posicao zero e menor

		for (int i : notas) {

			if (i < menorNota)
				menorNota = i;
		}

		return menorNota;
	}

	public int getMaiorNota() {
		int maiorNota = notas[0];

		for (int i : notas) {

			if (i > maiorNota)
				maiorNota = i;
		}

		return maiorNota;
	}

	public void getGraficoBarChart() {
		System.out.println("Distribuicao de notas: ");

		int[] frequenciaDeNotas = new int[11];

		for (int nota : notas)
			++frequenciaDeNotas[nota / 10]; // como nota vai de 10 a 100 dividimos por dez pra nao estourar o array e
											// incrementamos um na frequencia

		for (int i = 0; i < frequenciaDeNotas.length; i++) {
			if (i == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%2d - %2d", i * 10, i * 10 + 9);

			for (int estrelas = 0; estrelas < frequenciaDeNotas[i]; estrelas++)
				System.out.print("*");

			System.out.println();
		}

	}

	/**
	 * Metodo que gera a saida das notas
	 */
	public void saidaNotas() {
		System.out.printf("As notas sao : %n%n");

		for (int estudante = 0; estudante < notas.length; estudante++) {
			System.out.printf("Estudante %2d: %3d%n", estudante + 1, notas[estudante]);
		}

	}

}
