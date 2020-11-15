package aula95.resource.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class Teste {

	public static void main(String[] args) {
		System.out.println("Locale atual "+ Locale.getDefault());

		ResourceBundle rb= ResourceBundle.getBundle("meu-texto");
		System.out.println("Olá: "+rb.getString("hello"));
		System.out.println("Mundo: "+rb.getString("world"));
		
		//Locale.setDefault(new Locale("en_US", "en_US"));
		rb= ResourceBundle.getBundle("meu-texto", new Locale("en_US", "en_US"));
		System.out.println("Olá Inglês: "+rb.getString("hello"));
		System.out.println("Mundo Inglês: "+rb.getString("world"));
		
		
	}

}
