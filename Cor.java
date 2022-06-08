package semaforo;

public enum Cor {

	VERDE(1), AMARELO(2), VERMELHO(3);
	
	private int i;
	
	Cor(int i) {
	
		this.i = i;
	}

	public int getCor() {
		
		return i;
	}
	
	
}
