package deitelCapitulo3;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class HeathProfile {
	private String nome;
	private String sobrenome;
	private String sexo;
	private int dia, mes, ano;
	private double alturaPolegadas;
	private double pesoLibras;

	public HeathProfile(String nome, String sobrenome, String sexo, int dia, int mes, int ano, double alturaPolegadas,
			double pesoLibras) {
		setNome(nome);
		setSobrenome(sobrenome);
		setSexo(sexo);
		setDia(dia);
		setMes(mes);
		setAno(ano);
		setAlturaPolegadas(alturaPolegadas);
		setPesoLibras(pesoLibras);

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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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

	public double getAlturaPolegadas() {
		return alturaPolegadas;
	}

	public void setAlturaPolegadas(double alturaPolegadas) {
		this.alturaPolegadas = alturaPolegadas;
	}

	public double getPesoLibras() {
		return pesoLibras;
	}

	public void setPesoLibras(double pesoLibras) {
		this.pesoLibras = pesoLibras;
	}

	public int getIdade() {
		return Period.between(LocalDate.of(this.getAno(), this.getMes(), this.getDia()), LocalDate.now()).getYears();
	}

	/**
	 * Metodo calcula a frequencia cardiaca máxima do paciente.
	 * 
	 * @return
	 */
	public int getFcm() {
		return (200 - this.getIdade());
	}

	/**
	 * Metodo retorna a frequencia cardiaca alvo do paciente.
	 * 
	 * @return
	 */
	public String getFca() {
		double fca1 = ((this.getFcm() * 50) / 100);
		double fca2 = ((this.getFcm() * 85) / 100);

		return "Sua frequencia cardiaca alvo é entre : " + fca1 + " e " + fca2 + "";

	}

	/**
	 * Metodo calcula o IMC do paciente
	 * 
	 * @return
	 */
	public String getImc() {
		double pesoEmQuilos = (this.getPesoLibras() / 2.205);// pounds to kg
		double alturaEmMetros = (this.getAlturaPolegadas() / 39.37);// polegadas to metros
		double imc = pesoEmQuilos / (alturaEmMetros * alturaEmMetros);

		if (imc < 18.5) {
			return "Abaixo do peso";
		} else if (imc >= 18.5 && imc <= 24.9) {
			return "Normal";
		} else if (imc >= 25 && imc <= 29.9) {
			return "Acima do peso";
		} else {
			return "Obeso";
		}
	}

	public void getRelatorio() {
		String relatorio = String.format("Relatorio\nNome:%s\nSobrenome:%s\nIdade:%d\nFCM:%d\nFCA:%s\nIMC:%s\n",
				this.getNome(), this.getSobrenome(), this.getIdade(), this.getFcm(), this.getFca(), this.getImc());

		JOptionPane.showMessageDialog(null, relatorio);
	}

}
