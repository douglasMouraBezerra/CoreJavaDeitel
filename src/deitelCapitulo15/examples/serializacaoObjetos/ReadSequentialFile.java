package deitelCapitulo15.examples.serializacaoObjetos;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile {

	private static ObjectInputStream objectInputStream;

	public static void openFile() {
		try {
			objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get("E://io/clientes.ser")));

		} catch (IOException e) {
			System.err.println("Erro ao abrir o arquivo. Terminantig");
			System.exit(1);
		}
	}

	public static void readRecords() {
		System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");

		try {
			while (true) {
				Account account = (Account) objectInputStream.readObject();
				System.out.printf("%-10d%-12s%-12s%10.2f%n", account.getAccount(), account.getFirstName(),
						account.getLastName(), account.getBalance());
			}

		} catch (EOFException eofException) {
			System.err.printf("%n Sem mais registros %n");

		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Tipo de objeto nao encontrado");
			System.exit(1);

		} catch (IOException ioException) {
			System.err.println("Erro ao ler arquivo.Terminando.");
			System.exit(1);
		}
	}

	public static void closeFile() {
		try {
			if (objectInputStream != null)
				objectInputStream.close();

		} catch (IOException ioException) {
			System.err.println("Nao foi possivel fechar o arquivo. Terminando.");
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		openFile();
		readRecords();
		closeFile();
	}

}
