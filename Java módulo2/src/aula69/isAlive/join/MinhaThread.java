package aula69.isAlive.join;

public class MinhaThread implements Runnable {
  private String nome; 
  private int tempo; 
  
  
	public MinhaThread(String nome, int tempo) {
	super();
	this.nome = nome;
	this.tempo = tempo;
	
}

	@Override
	public void run() {
	
		
			try {
				for (int i=0; i<6; i++) {
					System.out.println(nome + " contador "+ i);				
					Thread.sleep(900);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	


