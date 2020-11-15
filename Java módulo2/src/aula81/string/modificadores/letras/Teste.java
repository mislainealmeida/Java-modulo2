package aula81.string.modificadores.letras;

public class Teste {

	public static void main(String[] args) {
		String teste= "Teste";
		String testeMinus = teste.toLowerCase();
		String testeMaiusc = teste.toUpperCase();
		
		System.out.println(testeMinus);
		System.out.println(testeMaiusc);
		
		// ao inves de usar equalsIgnoreCase pode fazer: 
		//if(teste.toLowerCase().equals(teste.toLowerCase()));
		
	}

}
