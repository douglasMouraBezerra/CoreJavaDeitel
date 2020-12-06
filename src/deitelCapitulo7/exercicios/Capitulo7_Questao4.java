package deitelCapitulo7.exercicios;

public class Capitulo7_Questao4 {

	private final int ARRAY_SIZE = 3;
	private int[][] table;

	public Capitulo7_Questao4() 
	{
		table = new int[ARRAY_SIZE][ARRAY_SIZE];
	}

	public void qtdElements() 
	{
		int qtd = 0;
		for (int linha = 0; linha < table.length; linha++)
			for (int coluna = 0; coluna < table[linha].length; coluna++)
				qtd += coluna;

		System.out.println("Quantidade de " + qtd + " elementos");

	}

	public void fillArray() 
	{
		for (int x = 0; x < table.length; x++)
			for (int y = 0; y < table[x].length; y++)
				table[x][y] = x + y;
	}

	public void showArrayElements() 
	{
		for (int linha = 0; linha < table.length; linha++)
			for (int coluna = 0; coluna < table[linha].length; coluna++)
				System.out.printf("Linha: %d || Coluna: %d || Elemento: %d%n"
						,linha
						,coluna
						,table[linha][coluna]);
	}

	public static void main(String[] args) {

		Capitulo7_Questao4 question = new Capitulo7_Questao4();

		// quantidade de elementos
		question.qtdElements();

		// preenchendo o array
		question.fillArray();

		// exibindo o array
		question.showArrayElements();

	}

}
