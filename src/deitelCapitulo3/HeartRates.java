package deitelCapitulo3;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
	private String nome;
	private String sobrenome;
	private int dia, mes, ano;

	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
		setNome(nome);
		setSobrenome(sobrenome);
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	// Java 8
	public int getIdade() {
		return Period.between(LocalDate.of(this.ano, this.mes, this.dia), LocalDate.now()).getYears();
	}

	public double getFrequenciaCardiacaMaxima() {
		return 220 - this.getIdade();
	}

	public String getFrequenciaCardiacaAlvo() {
		double fac1 = (this.getFrequenciaCardiacaMaxima() * 50) / 100;
		double fac2 = (this.getFrequenciaCardiacaMaxima() * 80) / 100;

		return "Sua frequencia cardiaca alve e entre " + fac1 + " e " + fac2 + " batimentos por minuto";

	}

}
