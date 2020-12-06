package deitelCapitulo4;

public class Exercicio4_4 {
	public static void main(String[] args) {
		// a)
		int x = 0;
		int y = 1;
		@SuppressWarnings("unused")
		int z = 0;
		z = x + y;
		++x;

		// b)
		int contador = 11;
		if (contador > 10)
			System.out.println("E maior que 11");
		else
			System.out.println("Menor que 11");

		// c)
		int total = 5;
		int x1 = 2;
		// decrementando
		--x1;

		total -= x1;
		System.out.println(total);

		// d)
		int q = 10;
		q %= 4;
		System.out.println("1º forma: " + q); // 2

		int q1 = 10;
		q1 = q1 % 6;
		System.out.println("2º forma: " + q1);// 4

	}
}
