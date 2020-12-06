package deitelCapitulo3.testes;

import java.util.Scanner;

import deitelCapitulo3.GradeBook;

public class TesteGradeBook {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the course name: ");
		String curso = input.nextLine();

		System.out.print("Enter the instructor name: ");
		String instrutor = input.nextLine();

		GradeBook gradeBook = new GradeBook(curso, instrutor);
		gradeBook.displayMessage();

		input.close();

	}
}
