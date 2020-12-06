package exemplosCapitulo2;
import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Informe o primeiro numero:");
		number1 = scanner.nextInt();
		
		System.out.print("Informe o segundo numero:");
		number2 = scanner.nextInt();
		
		sum = (number1 + number2);
		
		System.out.printf("A soma foi: %d\n",sum);
		
		scanner.close();
		
		
	}
	
}
