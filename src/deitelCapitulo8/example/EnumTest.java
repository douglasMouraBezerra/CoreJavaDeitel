package deitelCapitulo8.example;

import java.util.EnumSet;

public class EnumTest 
{
	public static void main(String[] args)
	{
		for (Book book : Book.values())
			System.out.printf("%-10s%-45s%s%n", book,book.getTitle(), book.getYear());
		
		
		System.out.printf("%nExibindo qtd especifica de enums:::%n");
		
		for(Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
			System.out.printf("%-10s%-45s%s%n",book,book.getTitle(),book.getYear());
		
		
	}
}
