package deitelCapitulo3.testes;

import java.util.Scanner;

import deitelCapitulo3.Account;

public class TesteAccount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your initial balance, to create your account: ");
		double initialBalance = scanner.nextDouble();

		Account account = new Account(initialBalance);

		account.credit(10);
		account.debit(20);

		scanner.close();
	}
}
