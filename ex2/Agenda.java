package ex2;

import java.util.ArrayList;

public class Agenda {
	
	Pessoa pessoa;
	private ArrayList<Pessoa> listaAgenda = new ArrayList<Pessoa>(10);

	public void armazenaPessoa(Pessoa pessoa) {
		listaAgenda.add(pessoa);
	}

	public void removePessoa(String nome) {
		pessoa = this.findBessoaByNome(nome);
		if(pessoa != null) {
			listaAgenda.remove(pessoa);
			System.out.println("Pessoa removida com sucesso");
		} else {
			System.out.println("Pessoa não encontrada");
		}
		
	}

	public int buscaPessoa(String nome) {
		pessoa = this.findBessoaByNome(nome);
		int posicao = listaAgenda.indexOf(pessoa);
		if(pessoa != null) {
			return posicao;
		} else {
			return -1;
		}
		
	}

	public void imprimeAgenda() {
		for (Pessoa pessoa : listaAgenda) {
			System.out.println("====================");
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: "+ pessoa.getIdade());
			System.out.println("Altura: " + pessoa.getAltura());
		}
	}

	public void imprimePessoa(int index) {
		pessoa = listaAgenda.get(index);
		System.out.println("====================");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: "+ pessoa.getIdade());
		System.out.println("Altura: " + pessoa.getAltura());
		System.out.println("====================");
	}
	
	private Pessoa findBessoaByNome(String nome) {
		for (Pessoa pessoa : listaAgenda) {
			if (pessoa.getNome().equals(nome)) {
				return pessoa;
			}
		}
		return null;
	}
}
