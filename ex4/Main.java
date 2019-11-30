package ex4;

public class Main {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		ControleRemoto remote = new ControleRemoto();

		System.out.println("Volume: " + tv.getVolume());
		remote.aumentarVolume(tv);
		System.out.println("Volume: " + tv.getVolume());
		remote.diminuirVolume(tv);
		System.out.println("Volume: " + tv.getVolume());
		remote.canalAnterior(tv);
		System.out.println("Canal: " + tv.getCanal());
		remote.canalAnterior(tv);
		System.out.println("Canal: " + tv.getCanal());
		remote.escolherCanal(tv, 12);
		tv.infoTelevisao();
	}

}
