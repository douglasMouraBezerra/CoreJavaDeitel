package deitelCapitulo5.exemplos;

/**
 * Uso de Break and Continue em estruturas de repeticao
 * 
 * @author Douglas
 *
 */
public class BreakAndContinue {
	public static void main(String[] args) {

		// aqui para o loop

		for (int contador = 1; contador <= 10; contador++) {
			if (contador == 5)
				break;
			System.out.printf("Contador:%d\n", contador);

		}

		// aqui pula uma instrucao e continua com o loop até a condicao ser false

		for (int contador = 1; contador <= 10; contador++) {
			if (contador == 8)
				continue;
			System.out.printf("\nContador:%d\n", contador);

		}

		int value = 9;
		switch (value % 2) {
		case 0:
			System.out.println("Par");
			break;
		case 1:
			System.out.println("impar");

		}

		int counter = 2;
		int qtd = 0;
		do {
			System.out.print(counter + " ");
			counter += 2;
			qtd++;
		} while (counter <= 100);

		System.out.println("\nQuantidade de pares de 2 a 100: " + qtd);

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("@");
			}
			System.out.println();
		}

	}

}
