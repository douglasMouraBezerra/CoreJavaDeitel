package deitelCapitulo14.exercises;



//ATIVIDADE 14.5 - DEITEL: SENTENCAS ALEATORIAS.

public class AleatorySentences 
{
	public static void main(String[] args) 
	{
		
		//Array de frases
		String [] sentences = new String[20];
		
		//arrays com classes de palavras
		String[] articles = { "the", "a", "one", "some", "any" };
		String[] nouns = { "boy", "girl", "dog", "town", "car" };
		String[] verbs = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] prepositions = { "to", "from", "over", "under", "on" };
		
		//pegando o tamanho de cada array para utilizar com o random
		int tamArticle = articles.length;
		int tamNouns = articles.length;
		int tamVerbs = articles.length;
		int tamPrepositions = articles.length;
		
		//perconrrendo array de frases para inserir uma frase em cada posicao
		for (int i = 0; i < sentences.length; i++) 
		{			
			int randomArticles = (int) (Math.random() * tamArticle);
			int randomNouns = (int) (Math.random() * tamNouns);
			int randomVerbs = (int) (Math.random() * tamVerbs);
			int randomPrepositions = (int) (Math.random() * tamPrepositions);
			int randomArticles2 = (int) (Math.random() * tamArticle);
			int randomNouns2 = (int) (Math.random() * tamNouns);
			
			//se o indice nao for o ultimo, entao ele não insere ponto final e nao capitaliza a primeira letra.
			//caso seja o ultimo indice então ele capitaliza e insere o ponto final.
			if(i != 19) 
			{
				sentences[i] = articles[randomArticles]
						.concat(" ")
						.concat(nouns[randomNouns])
						.concat(" ")
						.concat(verbs[randomVerbs])
						.concat(" ")
						.concat(prepositions[randomPrepositions])
						.concat(" ")
						.concat(articles[randomArticles2])
						.concat(" ")
						.concat(nouns[randomNouns2]);
			}
			else
			{
//				sentences[i] = StringUtils.capitalize(articles[randomArticles])
//						.concat(" ")
//						.concat(nouns[randomNouns])
//						.concat(" ")
//						.concat(verbs[randomVerbs])
//						.concat(" ")
//						.concat(prepositions[randomPrepositions])
//						.concat(" ")
//						.concat(articles[randomArticles2])
//						.concat(" ")
//						.concat(nouns[randomNouns2])
//						.concat(".");
			}
		}
		
		//imprimindo frases gerada no console.
		for (String string : sentences) 
			System.out.println(string);		
	}
}
