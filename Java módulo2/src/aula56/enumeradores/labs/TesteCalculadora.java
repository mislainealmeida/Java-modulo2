package aula56.enumeradores.labs;

import aula56.enumeradores.abstratos.TipoDocumento;

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		double numero1= 5; 
		double numero2 = 3;
		
		for(Operacoes op: Operacoes.values()) {// chamando o array  do enum (values)
			System.out.print(numero1 + " ");
			System.out.print(op.toString()+ " ");
			System.out.print(numero2 + " = ");
			System.out.println(op.executarOperacoes(numero1, numero2));
		}
		
		
		
		
		
		
		

	}

}
