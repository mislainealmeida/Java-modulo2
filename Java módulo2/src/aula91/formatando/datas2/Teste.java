package aula91.formatando.datas2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Teste {

	public static void main(String[] args) {
		
		Date hoje= new Date();
		System.out.println(Locale.getDefault());
		
				
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		
		Locale.setDefault(Locale.ENGLISH);;;
		String hojeFormatado1 = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado1);
		
		hojeFormatado= DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		
		
		
	}

}
