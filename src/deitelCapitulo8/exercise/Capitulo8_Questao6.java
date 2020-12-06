package deitelCapitulo8.exercise;

public class Capitulo8_Questao6 
{
	private static double annualInterestRate;
	private double savingsBalance;
	
	public Capitulo8_Questao6(double s) 
	{
		savingsBalance = s;
	}
	
	public void calculateMonthInterest()
	{
		this.savingsBalance += (savingsBalance * annualInterestRate) / 12;
	}
	
	public static void modifyInterestRate(double newInterestRate)
	{
		annualInterestRate = newInterestRate;
	}
	
	public double getSavingsBalance() 
	{
		return savingsBalance;
	}
	
	@Override
	public String toString() {
		return "Capitulo8_Questao6 [savingsBalance=" + savingsBalance + "]";
	}

	public static void main(String[] args) 
	{
		Capitulo8_Questao6.modifyInterestRate(0.05);
		
		Capitulo8_Questao6 saver1 = new Capitulo8_Questao6(1000);
		Capitulo8_Questao6 saver2 = new Capitulo8_Questao6(2000);
		
		saver1.calculateMonthInterest();
		saver2.calculateMonthInterest();
		
		System.out.println(String.format("%.2f", saver1.getSavingsBalance()));
		System.out.println(String.format("%.2f", saver2.getSavingsBalance()));
		
		
	}
	
}
