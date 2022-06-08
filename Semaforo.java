package semaforo;

public class Semaforo {
	
	private Cor cor;
	
	
	public Semaforo(Cor cor) {
		
		this.cor = cor;
	}
		
	public void mudaCor() {
		
		if(this.cor == Cor.VERMELHO) {
			
			this.cor = Cor.VERDE;
		
		}else if(this.cor == Cor.VERDE) {
			
			this.cor = Cor.AMARELO;
		
		 }else {
			 
			 this.cor = Cor.VERMELHO;
		 }
	
	}
	
	public void pedestreAcao() {
		
		if(cor.getCor() == 3) {
			
			System.out.println("Sinal Vermelho para os carros. Pedestre, ande \n");
		
		}else if(cor.getCor() == 2) {
			
			System.out.println("Atenção, sinal amarelo \n");
		}else if(cor.getCor() == 1) {
			
			System.out.println("Sinal verde para os carros. Pedestre, pare \n");
		}
	}

}
