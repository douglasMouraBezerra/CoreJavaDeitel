package deitelCapitulo16.examples.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	/**
	 * Metodo gra saida de valores de propriedades
	 * 
	 * @param props
	 */
	private static void listProperties(Properties props) {
		Set<Object> keys = props.keySet(); // obtem os nomes da propriedades

		for (Object key : keys)
			System.out.printf("%s\t%s%n", key, props.getProperty((String) key));

		System.out.println();
	}

	/**
	 * Salva propriedade em um arquivo
	 * 
	 * @param props
	 */
	private static void saveProperties(Properties props) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("E://io/props.dat");
			props.store(fileOutputStream, "Propriedades simples");
			fileOutputStream.close();
			System.out.println("Apos salvar propriedades...");
			listProperties(props);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Carrega as propriedades de um arquivo
	 * 
	 * @param props
	 */
	private static void loadPropertiesTable(Properties props) {
		try {
			FileInputStream fileInputStream = new FileInputStream("E://io/props.dat");
			props.load(fileInputStream); // carrega propriedades
			fileInputStream.close();
			System.out.println("Apos carregar propriedades");
			listProperties(props);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Properties table = new Properties();
		table.setProperty("color", "blue");
		table.setProperty("width", "200");

		System.out.println("Apos setar propriedades:::");
		listProperties(table);

		// substitui o valor de propriedade
		table.setProperty("color", "red");
		saveProperties(table);

		// esvaziando tabela
		table.clear();

		System.out.println("Apos apagar tabela:::");
		listProperties(table);

		loadPropertiesTable(table);

		// obtendo valor de propriedade
		Object valor = table.getProperty("color");

		if (valor != null)
			System.out.printf("Propriedade cor tem valor de %s%n ", valor);
		else
			System.out.println("Propriedade cor nao esta na tabela.");
	}
}
