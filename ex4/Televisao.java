package ex4;

public class Televisao {
	
	private int canal;
	private int volume;
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}	
	
	public void infoTelevisao() {
		System.out.println("--------Tv----------");
		System.out.println("Volume: " + this.volume);
		System.out.println("Canal: " + this.canal);
	}
	
}
