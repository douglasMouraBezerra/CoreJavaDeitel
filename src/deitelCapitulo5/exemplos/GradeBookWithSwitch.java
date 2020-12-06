package deitelCapitulo5.exemplos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class GradeBookWithSwitch {

	private String nomeCurso;
	private int total;
	private int gradeCounter;
	private int aCount;
	private int bCount;
	private int cCount;
	private int dCount;
	private int fCount;

	public GradeBookWithSwitch(String nomeDoCurso) {
		setNomeCurso(nomeDoCurso);
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void mensagemDoDisplay() {
		String mensagem = String.format("\n%s\n", "Bem vindo ao curso de " + getNomeCurso());
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public void addNotas() {
		Scanner input = new Scanner(System.in);
		int nota;

		System.out.printf("%s\n%s\n", "Informe uma nota:", "Pressione Ctrl + Z para encerrar:");

		while (input.hasNext()) {
			nota = input.nextInt();
			total += nota;
			++gradeCounter;// ++ pq inicia com zero por padrao

			// metodo helper que incrementa o contador adequado
			incrementaQuantidadeDeNotas(nota);
		}

		input.close();
	}

	private void incrementaQuantidadeDeNotas(int nota) {
		switch (nota / 10) {
		case 10:
		case 9:
			++aCount;
			break;

		case 8:
			++bCount;
			break;

		case 7:
			++cCount;
			break;

		case 6:
			++dCount;
			break;

		default:
			++fCount;
			break;
		}

	}

	public void displayGradeReport() {
		System.out.println("\nGrade Report");

		if (gradeCounter != 0) {

			double media = (double) total / gradeCounter;

			System.out.printf("Total de %s inseridas totalizando %d\n", gradeCounter, total);
			System.out.printf("A media da turma foi de %.2f ", media);
			System.out.printf("\n%s%d \n%s%d \n%s%d \n%s%d \n%s%d", "A:", aCount, "B:", bCount, "C:", cCount, "D:", dCount,
					"F:", fCount);
		}

	}

	public static void main(String[] args) {
		GradeBookWithSwitch withSwitch = new GradeBookWithSwitch("Ciencia da Computacao");
		withSwitch.mensagemDoDisplay();

		withSwitch.addNotas(); // insere notas
		withSwitch.displayGradeReport(); // mostra relatorio completo

	}

}
