package deitelCapitulo15.examples.estudoDeCaso;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {
	private static final MenuOption[] choices = MenuOption.values();

	public static void main(String[] args) {
		// obtem solicitacao do usuario
		MenuOption accountType = getRequest();

		while (accountType != MenuOption.END) {
			switch (accountType) {
			case ZERO_BALANCE:
				System.out.printf("%nConta com balanco zerado:%n");
				break;

			case CREDIT_BALANCE:
				System.out.printf("%nConta com credito:%n");
				break;

			case DEBIT_BALANCE:
				System.out.printf("%nConta com debito:%n");
				break;

			default:
				break;
			}
			readRecords(accountType);
			accountType = getRequest(); // obtem a solicitacao do usuario novamente
		}
	}

	/**
	 * obtém a solicitação do usuário
	 * 
	 * @return {@link MenuOption}
	 */
	@SuppressWarnings("resource")
	public static MenuOption getRequest() {
		int request = 4;

		System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n", " 1 - List accounts with zero balances",
				" 2 - List accounts with credit balances", " 3 - List accounts with debit balances",
				" 4 - Terminate program");

		try {
			Scanner input = new Scanner(System.in);
			do { // insere a solicitação de usuário
				System.out.printf("%n?");
				request = input.nextInt();

			} while ((request < 1) || (request > 4));

		} catch (NoSuchElementException noSuchElementException) {
			System.err.println("Entrada Invalida. Terminando");
		}

		return choices[request - 1]; // retorna o valor enum da opção
	}

	private static void readRecords(MenuOption accountType) {
		try (Scanner scanner = new Scanner(Paths.get("E://io/clients.txt"))) {
			while (scanner.hasNext()) {
				int accountNumber = scanner.nextInt();
				String firstName = scanner.next();
				String lastName = scanner.next();
				double balance = scanner.nextDouble();

				// se o tipo de conta for adequada, exibe o registro
				if (shouldDisplay(accountType, balance))
					System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber, firstName, lastName, balance);
			}
		} catch (NoSuchElementException | IOException | IllegalStateException error) {
			System.err.println("Erro ao processa arquivo. Termiando");
			System.exit(1);
		}
	}

	/**
	 * Utiliza o tipo de registro para determinar se registro deve ser exibido
	 * 
	 * @param accountType
	 * @param balance
	 * @return {@link Boolean}
	 */
	private static boolean shouldDisplay(MenuOption accountType, double balance) {
		if ((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0))
			return true;
		else if ((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0))
			return true;
		else if ((accountType == MenuOption.ZERO_BALANCE) && (balance == 0))
			return true;

		return false;
	}

}
