package deitelCapitulo4;

import java.util.Scanner;

public class Exercicio4_18 {
	public static void main(String[] args) {
		int saldo;
		int numeroDaConta;
		int totalItensCobrados;
		int totalCreditosLancados;
		int limiteAutorizado;
		int contador = 1;
		Scanner s = new Scanner(System.in);
		while (contador != -1) {
			System.out.print("Digite o numero da conta::");
			numeroDaConta = s.nextInt();

			System.out.print("Digite o saldo inicial::");
			saldo = s.nextInt();

			System.out.print("Digite o total de itens cobrados::");
			totalItensCobrados = s.nextInt();

			System.out.print("Digite o total de créditos lancados::");
			totalCreditosLancados = s.nextInt();

			System.out.print("Digite o limite de crédito autorizado::");
			limiteAutorizado = s.nextInt();
			
			double novoSaldo = (double) saldo + totalItensCobrados - totalCreditosLancados;

			System.out.printf("\nConta: %d\nNovo Saldo: %.2f\n", numeroDaConta, novoSaldo);

			if (novoSaldo > limiteAutorizado) {
				System.out.println("Limite de credito excedido");
			}

			System.out.println("Deseja continuar ? -1 Para Sair");
			contador = s.nextInt();
		}
		s.close();

	}
}
