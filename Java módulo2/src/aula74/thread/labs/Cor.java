package aula74.thread.labs;

public enum Cor {
	VERDE(1000), AMARELO(300),VERMELHO(2000);
	private int tempoEspera;
	
	Cor(int tempoEspera){
		this.tempoEspera= tempoEspera;
	}

	public int getTempoEspera() {
		return tempoEspera;
	}

	
	

}
