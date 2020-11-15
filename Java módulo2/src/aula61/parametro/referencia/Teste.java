package aula61.parametro.referencia;

public class Teste {

	public static void main(String[] args) {
		Contato contato= new Contato ("Contato 1", "1234-45678", "contato@email.com");
		int valor=10;
		System.out.println("****Valores originais****");
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("****Exemplo 1****");
		valorReferencia(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("****Exemplo 2****");
		valorReferencia2(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);

	}
	private static void valorReferencia(int valor, Contato contato) {
		int novoValor= valor+10;
		valor=novoValor;
		contato= new Contato("Contato 2", "1234-5678", "contato2@email.com");
		
	}
	private static void valorReferencia2(int valor, Contato contato) {
		int novoValor= valor +10; 
		valor= novoValor;
		
		contato.setNome("Contato " + novoValor);
	}


	
	
	}

