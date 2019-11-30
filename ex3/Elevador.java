package ex3;

public class Elevador {
	
	private int qtdeAndares;
	private int andar = 0;
	private double capacidade;
	private int pessoas;
	private int qtdePessoas = 0;
	
	public int getQtdeAndares() {
		return qtdeAndares;
	}
	public void setQtdeAndares(int qtdeAndares) {
		this.qtdeAndares = qtdeAndares;
	}
	
	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	public int getPessoas() {
		return pessoas;
	}
	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}	
	
	public void inicializar() {
		System.out.println("Elavador inicializado!");
		System.out.println("Andar: Terreo - Total: " + this.qtdeAndares);
		System.out.println("Pessoas: 0 - Total: "+ this.pessoas);
		System.out.println("Capacidade: "+ this.capacidade);
		System.out.println("---------------------------------------");
	}
	
	public void entrar() {
		if (this.qtdePessoas < this.pessoas) {
			this.qtdePessoas++;
			System.out.println("Andar: Terreo - Total: " + this.qtdeAndares);
			System.out.println("Pessoas: " + this.qtdePessoas + " - Total: "+ this.pessoas);
			System.out.println("---------------------------------------");
		} else {
			System.out.println("Elevador Lotado!");
		}
	}
	
	public void sair() {
		if (this.qtdePessoas > 0) {
			this.qtdePessoas--;
			System.out.println("Andar: Terreo - Total: " + this.qtdeAndares);
			System.out.println("Pessoas: " + this.qtdePessoas + " - Total: "+ this.pessoas);
			System.out.println("---------------------------------------");
		} else {
			System.out.println("Elevador Vazio!");
		}
	}
	
	public void subir() {
		if (this.andar < this.qtdeAndares) {
			this.andar++;
			System.out.println("Andar: " + this.andar + " - Total: " + this.qtdeAndares);
			System.out.println("Pessoas: " + this.qtdePessoas + " - Total: "+ this.pessoas);
			System.out.println("---------------------------------------");
		} else {
			System.out.println("Elevador no ultimo Andar!");
		}
	}
	
	public void descer() {
		if (this.andar > 0) {
			this.andar--;
			if (this.andar == 0) {
				System.out.println("Andar: Terreo - Total: " + this.qtdeAndares);
			} else {
				System.out.println("Andar: " + this.andar + " - Total: " + this.qtdeAndares);
			}
			System.out.println("Pessoas: " + this.qtdePessoas + " - Total: "+ this.pessoas);
			System.out.println("---------------------------------------");
		} else {
			System.out.println("Elevador no Terreo!");
		}
	}
	
}
