package aula87.calendar;

import java.util.Calendar;

public class Teste {

	public static void main(String[] args) {
		
		Calendar hoje= Calendar.getInstance(); // ja retorna um new Calendar (singleton).
		int ano= hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		
		System.out.printf("Hoje é: :%02d/%02d/%d %02d:%02d:%02d",dia,  (mes+1),ano, hora, minutos, segundos); 
		System.out.println();
		hoje.add(Calendar.DAY_OF_MONTH, 4);
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		
		hoje.add(Calendar.DAY_OF_MONTH, -2);
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		

	}

}
