package deitelCapitulo3;

import java.util.Scanner;

public class HeathProfileTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String nome, sobrenome;
		String sexo;

		int ano, mes, dia;

		double altura, peso;

		System.out.print("Digite seu nome: ");
		nome = input.nextLine();

		System.out.print("Digite seu sobrenome:");
		sobrenome = input.nextLine();

		System.out.print("Digite seu sexo [F / M]:");
		sexo = input.nextLine();

		System.out.print("Digite o ano do seu nascimento:");
		ano = input.nextInt();

		System.out.print("Digite o mes do seu nascimento:");
		mes = input.nextInt();

		System.out.print("Digite o dia do seu nascimento:");
		dia = input.nextInt();

		System.out.print("Digite o seu peso em libras:");
		peso = input.nextDouble();

		System.out.print("Digite a sua altura em polegadas:");
		altura = input.nextDouble();

		// criando a referencia
		HeathProfile perfil = new HeathProfile(nome, sobrenome, sexo, dia, mes, ano, altura, peso);
		perfil.getRelatorio();

		input.close();
	}
}
