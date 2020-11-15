package aula70.prioridades;

public class Teste {

	public static void main(String[] args) {
		MinhaThread thread1= new MinhaThread("#1",500);
		MinhaThread thread2= new MinhaThread("#2",500);
		MinhaThread thread3= new MinhaThread("#3",500);

		Thread t1= new Thread(thread1);
		Thread t2= new Thread(thread2);
		Thread t3= new Thread(thread3);
		
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);
		
		//t1.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
