package ex1;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {

	private String nome;
	
	private Date nascimento;
	
	private double altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void dadosPessoa() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Data Nascimento: "+ this.nascimento);
		System.out.println("Altura: "+ this.altura);
	}
	
	public int calcularIdade() {
		Calendar cData = Calendar.getInstance();
		Calendar cHoje= Calendar.getInstance();
		cData.setTime(this.nascimento);
		cData.set(Calendar.YEAR, cHoje.get(Calendar.YEAR));
		int idade = cData.after(cHoje) ? -1 : 0;
		cData.setTime(this.nascimento);
		idade += cHoje.get(Calendar.YEAR) - cData.get(Calendar.YEAR);
		return idade;
	}
	
}
