package ex2;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Arthur",27,1.84);
		Pessoa p2 = new Pessoa("Pedro", 20, 1.70);
		Pessoa p3 = new Pessoa("Kiko", 59,1.56);
		
		Agenda agenda = new Agenda();
		
		agenda.armazenaPessoa(p1);
		agenda.armazenaPessoa(p2);
		agenda.armazenaPessoa(p3);
		agenda.imprimePessoa(1);
		agenda.removePessoa("Kiko");
		System.out.println("Posicao: " + agenda.buscaPessoa("Pedro"));
		System.out.println("---Lista Agenda---");
		agenda.imprimeAgenda();
		
	}
}
