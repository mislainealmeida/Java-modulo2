package aula89.formatando.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Teste {

	public static void main(String[] args) {
		SimpleDateFormat sdf= new SimpleDateFormat(" dd/MMM/yyyy  HH:mm:ss  a z");
		Calendar data = new GregorianCalendar (2020, 9, 21, 20,30,25);
		System.out.println(sdf.format(data.getTime()));

		Date hoje= new Date();
		String d= sdf.format(hoje);
		System.out.println(sdf.format(hoje));
		
		SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "20/02/2020";
		try {
			Date minhaDataEmDate = sdf1.parse(minhaData);
					
			//System.out.println(minhaDataEmDate);
			System.out.println(sdf.format(minhaDataEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
