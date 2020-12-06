package deitelCapitulo10.exercises;

import java.time.LocalDate;

import deitelCapitulo10.examples.date.Date;
import deitelCapitulo10.examples.funcionario.Funcionario;
import deitelCapitulo10.examples.funcionario.FuncionarioAssalariado;
import deitelCapitulo10.examples.funcionario.FuncionarioComissionado;
import deitelCapitulo10.examples.funcionario.FuncionarioComissionadoSalarioBase;
import deitelCapitulo10.examples.funcionario.FuncionarioPorHora;

/**
 * Exercicio do Capitulo 10 Questao 12. Estou reaproveitando as classes prontas
 * do pacote examples.funcionario e examples.date
 * 
 * @author Douglas
 *
 */
public class TestHierarquiaFuncionario 
{
	public static void main(String[] args) 
	{
		Funcionario[] funcionario = new Funcionario[4];

		Date date = new Date(07, 15, 1995);
		funcionario[0] = new FuncionarioAssalariado("A", "B", "123456", 400.00, date);

		Date date2 = new Date(12, 06, 1991);
		funcionario[1] = new FuncionarioComissionado("B", "C", "54321", 2000.00, .05, date2);

		Date date3 = new Date(01, 12, 1998);
		funcionario[2] = new FuncionarioComissionadoSalarioBase("C", "D", "98564", 1500.00, .06, 500.00, date3);

		Date date4 = new Date(11, 28, 1999);
		funcionario[3] = new FuncionarioPorHora("E", "F", "23789", 15.00, 60, date4);

		
		for (Funcionario funcionario2 : funcionario) 
		{
			int mesAtual = LocalDate.now().getMonthValue();
			
			if((funcionario2 instanceof FuncionarioPorHora
				|| funcionario2 instanceof FuncionarioComissionado
				|| funcionario2 instanceof FuncionarioComissionadoSalarioBase
				|| funcionario2 instanceof FuncionarioAssalariado) 
				&& funcionario2.getDateBirth().getMonth() == mesAtual)
			{
				funcionario2.bonificacaoSalarioAniversario(funcionario2);
			}
			
			System.out.println(funcionario2);
		}

	}
}
