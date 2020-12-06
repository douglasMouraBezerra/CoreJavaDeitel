package deitelCapitulo15.examples.serializacaoObjetos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequentiaFile {

	private static ObjectOutputStream objectOutputStream;

	/**
	 * Metodo que abre um arquivo para escrita de objeto
	 */
	public static void openFile() {
		try {
			objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("E://io/clientes.ser")));

		} catch (IOException e) {
			System.err.println("Erro ao abir o arquivo. Terminando");
			System.exit(1);
		}
	}

	/**
	 * Metodo que serializa o objeto no arquivo aberto
	 */
	@SuppressWarnings("resource")
	public static void addRecords() {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name and balance.",
				"Enter end-of-file indicator to end input.");

		while (scanner.hasNext()) {
			try {
				Account accountRecord = new Account(scanner.nextInt(), scanner.next(), scanner.next(),
						scanner.nextDouble());

				// serializa o objeto no arquivo
				objectOutputStream.writeObject(accountRecord);

			} catch (NoSuchElementException error) {
				System.err.println("Entrada invalida. Por favor tente novamente.");
				System.exit(1);

			} catch (IOException error) {
				System.err.println("Erro ao escrever no arquivo.Termiando");
				System.exit(1);
			}
		}
	}

	public static void closeFile() {
		try {
			if (objectOutputStream != null)
				objectOutputStream.close();

		} catch (IOException error) {
			System.err.println("Erro ao fechar o arquivo. Terminating");
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		openFile();
		addRecords();
		closeFile();
	}
}
