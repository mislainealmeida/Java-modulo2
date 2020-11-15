package aula99.random;

import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		System.out.println(Math.floor(Math.random() * 10));
		
		Random aleatorio = new Random();
		
		System.out.println(aleatorio.nextInt());
		System.out.println(aleatorio.nextInt(11));		

	}

}
