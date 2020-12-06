package deitelCapitulo15.examples.estudoDeCaso;

/**
 * tipo enum para as opções do programa de consulta de crédito.
 * 
 * @author Douglas
 *
 */
public enum MenuOption {
	
	ZERO_BALANCE(1),
	CREDIT_BALANCE(2),
	DEBIT_BALANCE(3),
	END(4);
	
	private final int value;
	
	private MenuOption(int value) {
		this.value = value;
	}
	
	public final int getValue() {
		return this.value;
	}
}
