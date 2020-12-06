package deitelCapitulo3;

public class Invoice {

	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;

	public Invoice(String numero, String descricao, int quantidade, double preco) {
		setNumero(numero);
		setDescricao(descricao);

		if (quantidade > 0 && preco > 0) {
			setQuantidade(quantidade);
			setPreco(preco);
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void getInvoiceAmount() {
		double total = 0;
		total = this.quantidade * this.preco;
		System.out.printf(
				"Total da fatura: %.2f\nNumero da Fatura: %s\nDescricao: %s\nQuantidade: %d\nPreco por peca: %.2f\n",
				total, this.numero, this.descricao, this.quantidade, this.preco);
	}

}
