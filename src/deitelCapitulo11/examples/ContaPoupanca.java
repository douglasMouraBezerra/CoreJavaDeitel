package deitelCapitulo11.examples;

import java.util.InputMismatchException;

public class ContaPoupanca extends Conta
{
	/**
	 * Processamento polimorfico das excecoes
	 */
	@Override
	public void depositar(Double saldo) throws IllegalArgumentException, InputMismatchException {
		super.depositar(saldo + 2.00);
	}
}
