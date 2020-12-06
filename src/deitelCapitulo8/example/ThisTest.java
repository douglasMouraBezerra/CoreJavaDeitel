package deitelCapitulo8.example;

public class ThisTest
{
	public static void main(String[] args)
	{
		SimpleTime time = new SimpleTime(15, 30, 19);
		System.out.println(time.buildString());
	}
}
class SimpleTime
	{
		private int hour; // 0-23
		private int minute; // 0-59
		private int second; // 0-59

		// se o construtor utilizar nomes de parâmetro idênticos a 
		//nomes de variáveis de instância a referência "this" será
		// exigida para distinguir entre os nomes
		public SimpleTime(int hour, int minute, int second)
		{			
			if(hour < 0 || hour >= 24 || minute < 0 || hour >= 60 || second < 0 || second >= 60)
			{
				throw new IllegalArgumentException("hour, minute or second was out of the range");
			}
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		
		public String buildString()
		{
			return String.format("%24s: %s%n%24s: %s","this.toUniversalString()", this.toUniversalString()
					,"toUniversalString()",toUniversalString());
		}
		
		//convert em string em formato data e hora universal
		public String toUniversalString()
		{
			//this nao requerido pq metodo nao tem variaveis locais como mesmo nome.
			return String.format("%02d:%02d:%02d"
					,this.hour
					,this.minute
					,this.second);
		}
	}
	