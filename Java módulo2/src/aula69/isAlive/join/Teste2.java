package aula69.isAlive.join;

public class Teste2 {

	public static void main(String[] args) {
		MinhaThread thread1 = new MinhaThread("Thread #1", 500);
		MinhaThread thread2 = new MinhaThread("Thread #2", 700);
		MinhaThread thread3 = new MinhaThread("Thread #3", 900);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
	        t3.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        
		
		
		System.out.println("Programa finalizaado");


	}

}
