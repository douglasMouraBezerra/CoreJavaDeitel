package deitelCapitulo3;

public class Date {
	private int mes, dia, ano;

	// subtendendo que os numeros passados estao corretos
	public Date(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String displayDate() {
		return this.getDia() + "/" + this.getMes() + "/" + this.getAno();
	}

}
