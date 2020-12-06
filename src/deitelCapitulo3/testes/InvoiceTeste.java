package deitelCapitulo3.testes;

import deitelCapitulo3.Invoice;

public class InvoiceTeste {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("1234567891011", "4 Calças Jeans", 4, 50);
		invoice.getInvoiceAmount();
	}

}
