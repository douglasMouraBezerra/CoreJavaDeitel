package deitelCapitulo15.examples;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
	private static Scanner input;
	
	public static void main(String[] args) {
		openFile();
		readRecords();
		closeFile();
	}
	
	public static void openFile() {
		try {
			
			input = new Scanner(Paths.get("E://io/clients.txt"));
			
		} catch (IOException ioException) {
			System.out.println("Erro ao tentar abrir o arquivo.Terminando");
			System.exit(1);
		}
	}
	
	public static void readRecords() {
		try {
			System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
				"First Name", "Last Name", "Balance");
			
			while(input.hasNext()) { // enquanto houver mais para ler
				// exibe o conteúdo de registro
				System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
				input.next(), input.next(), input.nextDouble());
			}
			
		} catch (NoSuchElementException suchElementException) {
			System.err.println("Arquivo mal formado. Terminating");
			
		} catch (IllegalStateException illegalStateException) {
			System.err.println("Erro ao ler do arquivo. Terminating.");
		}
	}
	
	public static void closeFile() {
		if(input != null) input.close();
	}
	
}
