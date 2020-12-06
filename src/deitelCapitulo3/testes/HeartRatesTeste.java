package deitelCapitulo3.testes;

import deitelCapitulo3.HeartRates;

public class HeartRatesTeste {
	public static void main(String[] args) {
		HeartRates rates = new HeartRates("Douglas", " de Moura", 14, 06, 1991);

		System.out.printf("Relatorio\nNome: %s\nSobrenome: %s\nIdade: %d\nFCM: %.2f\nFCA: %s\n", rates.getNome(),
				rates.getSobrenome(), rates.getIdade(), rates.getFrequenciaCardiacaMaxima(),
				rates.getFrequenciaCardiacaAlvo());

	}
}
