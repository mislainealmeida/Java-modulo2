package aula96.number.format;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class Teste {

	public static void main(String[] args) throws ParseException {
		//1.000,00 BR
		//1,000.00 EUA
		
		Locale en = new Locale ("en", "United Stated");
		NumberFormat nf = NumberFormat.getInstance(en);
		
		String num= nf.format(100.99);
		System.out.println(num);
		
		Locale br= new Locale("pt", "Brazil");
		nf= NumberFormat.getInstance(br);
		num= nf.format(100.99);
		System.out.println(num);
		
		//MOEDA
		NumberFormat moeda= NumberFormat.getCurrencyInstance(Locale.getDefault());
		String valor = moeda.format(100.99);
		System.out.println(valor);
		Currency currecy= moeda.getCurrency();
		System.out.println(currecy);
		
		
		// PORCENTAGEM 
		NumberFormat porcent = NumberFormat.getPercentInstance();
		String porcentagem= porcent.format(99.98);
		System.out.println(porcentagem);
		
		porcent.setMaximumIntegerDigits(4);
		porcent.setMinimumIntegerDigits(3);
		
		porcent.setMaximumFractionDigits(2);
		porcent.setMinimumFractionDigits(1);
		
		System.out.println(porcentagem);
		
		
		//ARREDONDAMENTO - só sera feito se formatar as casas decimais
		
		nf= NumberFormat.getInstance();
		nf.setRoundingMode(RoundingMode.UP);
		nf.setMaximumFractionDigits(0);
		nf.setMinimumFractionDigits(0);
		
		System.out.println(nf.format(99.50));
		
		Number num3= nf.parse("100,00");
		System.out.println(num3.intValue());
				

	}

}
