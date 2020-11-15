package aula70.prioridades;

public class MinhaThread implements Runnable {
  private String nome; 
  private int tempo; 
  
  
	public MinhaThread(String nome, int tempo) {
	super();
	this.nome = nome;
	this.tempo = tempo;
	Thread t= new Thread(this);
	t.start();
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
	


