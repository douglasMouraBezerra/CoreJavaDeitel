package deitelCapitulo4;

public class Exercicio4_6 {
	public static void main(String[] args) {
		int sum = 0;
		int contador = 1;

		while (contador <= 10) {
			sum += contador;
			contador++;
		}

		System.out.println("A soma foi de: " + sum);
	}
}
