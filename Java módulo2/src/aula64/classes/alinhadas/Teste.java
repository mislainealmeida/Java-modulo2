package aula64.classes.alinhadas;

import aula64.classes.alinhadas.Externa.Interna;

public class Teste {

	public static void main(String[] args) {
		Externa externa = new Externa(); 
		Interna interna = externa.new Interna();
		 
		interna.imprimeTexto();

	}

}
