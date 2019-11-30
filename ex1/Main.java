package ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Arthur Almerio");
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 		
		Date data = formato.parse("27/03/1992");
		pessoa.setNascimento(data);
		pessoa.setAltura(1.84);
		
		pessoa.dadosPessoa();
		System.out.println("Idade:" + pessoa.calcularIdade());
	}

}
