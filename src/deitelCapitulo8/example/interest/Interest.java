package deitelCapitulo8.example.interest;


import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest 
{
	public static void main(String[] args) 
	{
		// qtd antes dos juros
		BigDecimal principal = BigDecimal.valueOf(1000.0);
		BigDecimal rate = BigDecimal.valueOf(0.05); // juros

		// exibe cabeçalhos
		System.out.printf("%s%20s%n", "YEAR", "Amount on deposit");

		for (int year = 1; year <= 10; year++) 
		{
			// calc nova quantidade durante o ano especificado
			BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

			// exibe o ano e a quantidade
			System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
		}
	}
}
