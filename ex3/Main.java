package ex3;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Elevador elevador = new Elevador();
		elevador.setQtdeAndares(10);
		elevador.setCapacidade(350);
		elevador.setPessoas(6);
		
		elevador.inicializar();
		Thread.currentThread().sleep(5000); 
		elevador.entrar();
		Thread.currentThread().sleep(3000); 
		elevador.subir();
		Thread.currentThread().sleep(3000); 
		elevador.descer();
		Thread.currentThread().sleep(3000); 
		elevador.entrar();
		Thread.currentThread().sleep(3000); 
		elevador.entrar();
		Thread.currentThread().sleep(3000); 
		elevador.entrar();
		Thread.currentThread().sleep(3000); 
		elevador.entrar();
		Thread.currentThread().sleep(3000); 
		elevador.sair();
		Thread.currentThread().sleep(3000); 
		elevador.subir();
		Thread.currentThread().sleep(3000); 
		elevador.subir();
		Thread.currentThread().sleep(3000); 
		elevador.subir();
		Thread.currentThread().sleep(3000); 
		elevador.subir();
		Thread.currentThread().sleep(3000); 
		elevador.subir();
		Thread.currentThread().sleep(3000); 
		elevador.subir();
		Thread.currentThread().sleep(3000); 
		elevador.subir();
		Thread.currentThread().sleep(3000); 
		elevador.subir();
		Thread.currentThread().sleep(3000); 
		elevador.subir();
		Thread.currentThread().sleep(3000); 
		elevador.subir();
	}

}
