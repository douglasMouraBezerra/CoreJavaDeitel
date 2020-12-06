package deitelCapitulo10.examples.funcionario;

/**
 * Classe de teste da hierarquia funcionario
 * 
 * @author Douglas de Moura
 *
 */
public class TesteHierarquiaFuncionario 
{
	
	
	//Para testar os codigos abaixo, descomente e insira uma data de aniversario para cada funcionario abaixo.
	public static void main(String[] args) 
	{
//		FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("A", "B", "123456", 2000, 0.05);
//		FuncionarioPorHora funcionarioPorHora = new FuncionarioPorHora("Maira", "Souza", "123459", 10.00, 44);
//		FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado("Tony", "Lip", "123410", 400.00);
//		FuncionarioComissionadoSalarioBase comissionadoSalarioBase = new FuncionarioComissionadoSalarioBase("Marcos",
//				"Silva", "598712", 1000.00, .05, 400.00);
		
		//Objetos diferentes que serao processados polimorficamente;
//		Fatura fatura = new Fatura("12345678943", "Calca Jeans Zara", 50, 65.90);

		
		// individualmente
		System.out.println("Objetos processados individualmente");
//
//		System.out.printf("Funcionario Comissionado%nGanhos: %.2f%n", funcionarioComissionado.getQuantiaPagavel());
//		System.out.printf("Funcionario por hora%nGanhos: %.2f%n", funcionarioPorHora.getQuantiaPagavel());
//		System.out.printf("Funcionario Assalariado%nGanhos: %.2f%n", funcionarioAssalariado.getQuantiaPagavel());
//		System.out.printf("Comissionado Salario Base%nGanhos: %.2f%n", comissionadoSalarioBase.getQuantiaPagavel());

		System.out.println("\nOBJETOS PROCESSADOS POLIMORFICAMENTE\n");

		// o salario de base plus ja e retornado com 10 por cento ja no metodo get, nao
		// sendo necessario aqui usar o instanceOf
		//Funcionario[] funcionarios = new Funcionario[4];

		Pagavel[] pagaveis = new Pagavel[5];
//		pagaveis[0] = funcionarioComissionado;
//		pagaveis[1] = comissionadoSalarioBase;
//		pagaveis[2] = funcionarioAssalariado;
//		pagaveis[3] = funcionarioPorHora;
//		pagaveis[4] = fatura; //important
		
		
		for(Pagavel p : pagaveis)
			System.out.printf("%s%n", p);

		
		for (int i = 0; i < pagaveis.length; i++) 
			System.out.println("\nObjeto " + i + " e um " + pagaveis[i].getClass().getSimpleName());
		
		// reimplementar toString adequado novamente. Está muito bagunçado
		// EXEMPLO CASO FOSSEMOS INCREMENTAR O SALARIO EM TEMPO DE EXECUCAO
//		for (Funcionario funcionario : funcionarios) { 
//			
//			System.out.println(funcionario);
//		
//			if(funcionario instanceof FuncionarioComissionadoSalarioBase) {
//				FuncionarioComissionadoSalarioBase base = (FuncionarioComissionadoSalarioBase) funcionario;
//				base.setSalarioBaseSemanal(base.getSalarioBaseSemenal2() + (base.getSalarioBaseSemenal2() * 1.10));
//				
//				System.out.println(base.getSalarioBaseSemenal2());
//				System.out.println(base.getQuantiaPagavel());
//			}
//			
//		}
		System.exit(0);
	}
}
