package aula90.locale;

import java.text.NumberFormat;
import java.util.Locale;

public class Teste {

	public static void main(String[] args) {
		
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Locale[] locales= Locale.getAvailableLocales();
		for (Locale loc: locales) {
			System.out.println("Nome: "+loc.getDisplayName());
			System.out.println("Código da língua: "+loc.getLanguage());
			System.out.println("Língua: "+loc.getDisplayLanguage());
			System.out.println("************************");
		}
		Locale br= new Locale("pt", "Brazil");
		Locale.setDefault(br);// para colocar br padrão. 
		
		NumberFormat nf= NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(50000000d));
		
		NumberFormat nf1= NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf1.format(50000000d));

	}

}
