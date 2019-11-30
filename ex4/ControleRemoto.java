package ex4;

public class ControleRemoto {
	
	public void aumentarVolume(Televisao tv) {
		if (tv.getVolume() < 100) {	
			tv.setVolume(tv.getVolume() + 1);
		}		
	}
	
	public void diminuirVolume(Televisao tv) {
		if (tv.getVolume() > 0) {
			tv.setVolume(tv.getVolume() - 1);
		}
	}
	
	public void proximoCanal(Televisao tv) {
		if (tv.getCanal() < 12) {	
			tv.setCanal(tv.getCanal() + 1);
		} else if (tv.getCanal() >= 12) {
			tv.setCanal(0);
		}
	}
	
	public void canalAnterior(Televisao tv) {
		if (tv.getCanal() > 0) {	
			tv.setCanal(tv.getCanal() -1 );
		} else if (tv.getCanal() <= 0) {
			tv.setCanal(12);
		}
	}
	
	public void escolherCanal(Televisao tv, int canal) {
		if (canal <= 12) {
			tv.setCanal(canal);
		} else {
			tv.setCanal(0);
		}
	}
	
	
}
