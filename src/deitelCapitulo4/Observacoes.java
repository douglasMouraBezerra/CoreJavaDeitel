package deitelCapitulo4;

import java.util.Scanner;

public class Observacoes {

	public void calculaMediaComSentinela() {
		Scanner entrada = new Scanner(System.in);
		int total = 0;
		int valor = 1;
		int media;
		int nota;
		int qtd = 0;
		while (valor != -1) {
			System.out.print("Digite uma nota: ");
			nota = entrada.nextInt();
			total += nota;

			qtd += 1;

			System.out.println();
			System.out.println("Para para pressione -1");
			valor = entrada.nextInt();
		}
		media = total / qtd;
		System.out.printf("A media da turma foi de: %d", media);
		entrada.close();

	}

	public void calculaMedia() {
		Scanner entrada = new Scanner(System.in);
		int nota;
		int total = 0;
		int media = 0;
		int contador = 1;
		System.out.println("Calculo da média da turma: ");
		while (contador <= 10) {
			System.out.print("Digite uma nota: ");
			nota = entrada.nextInt();
			total += nota;
			contador += 1;
		}

		// calc media
		media = total / contador;
		System.out.printf("A media da turma foi de: %d", media);
		entrada.close();
	}

	public static void main(String[] args) {
//		int x = 6;
//		int y = 5;
//
//		if (x > 5) {
//			if (y > 5)
//				System.out.println("x and y maior que 5");
//		} else
//			System.out.println("x <= 5");

		Observacoes observacoes = new Observacoes();
//		observacoes.calculaMedia();
		observacoes.calculaMediaComSentinela();
	}

}
