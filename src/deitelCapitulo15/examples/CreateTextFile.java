package deitelCapitulo15.examples;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile 
{
	private static Formatter saida; //envia uma saida de texto para um arquivo
	
	public static void main(String[] args) {
		openFile();
		addRecords();
		closeFile();
	}
	
	public static void openFile() {
		try {
			saida = new Formatter("E:\\io/clients.txt");
			
		} catch (SecurityException securityException) {
			System.err.println("Permissao para escrever negada.Terminando");
			System.exit(1);
			
		}catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Arquivo nao encontrado.Terminando");
			System.exit(1);
		}
	}
	
	public static void addRecords() {
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n? ",
			 "Enter account number, first name, last name and balance.",
			 "Enter end-of-file indicator to end input.");
		
		while(input.hasNext()) {
			try {
				saida.format("%d %s %s %.2f%n"
						, input.nextInt()
						, input.next()
						, input.next()
						, input.nextDouble());
				
			} catch (FormatterClosedException formatterClosedException) {
				System.err.println("Error ao escrever no arquivo. Terminado");
				break;
				
			}catch (NoSuchElementException elementException) {
				System.err.println("Entrada invalida.Por favor tente novamente.");
				input.nextLine(); // descarta entrada para o usuário tentar de novo
			}
			
			System.out.println("? ");
			
		}
		
		input.close();
	}
	
	public static void closeFile() {
		if(saida != null) saida.close();
	}
}
