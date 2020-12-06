package deitelCapitulo5.exemplos;

/**
 * App para calculo de juros de um valor depositado em conta por 10 anos formula
 * : a = p(1 + r)n
 * 
 * @author Douglas
 *
 */
public class JurosCompostos {
	public static void main(String[] args) {

		double principal = 1000.0;
		double juro = 0.05;
		double quantiaComJurosAoAno = 0;

		System.out.printf("%s%20s\n", "Ano", "Valor c/ Juros p/ Ano");
		for (int ano = 1; ano <= 10; ano++) {
			quantiaComJurosAoAno = principal * (Math.pow(1.0 + juro, ano));

			System.out.printf("%4d%,20.2f\n", ano, quantiaComJurosAoAno);

		}

	}
}
