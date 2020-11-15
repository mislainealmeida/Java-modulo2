package aula55.enumeradores.value.valueof;

import aula53.enumeradores.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		DiaSemana[] dias = DiaSemana.values();
		for(int i=0; i<dias.length; i++) {
			System.out.println(dias[i]);
			
		}
		// ou pode ser feito um for melhorado. 
		for(DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}
	}

}
