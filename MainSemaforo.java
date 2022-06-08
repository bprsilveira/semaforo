package semaforo;

public class MainSemaforo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Semaforo s = new Semaforo(Cor.VERMELHO);
		
		
		s.mudaCor();
		s.pedestreAcao();		
		
		s.mudaCor();
		s.pedestreAcao();
		
		s.mudaCor();
		s.pedestreAcao();
	}

}
