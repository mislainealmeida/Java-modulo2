package aula93.datas.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		
		LocalDate agora= LocalDate.now();
		System.out.println(agora);
		
		System.out.println(LocalDate.of(2020, 12, 1));
		System.out.println(LocalDate.parse("2020-12-01"));
		
		System.out.println(agora.plusDays(30));
		System.out.println(agora.minusDays(15));
		
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.isLeapYear());
		
		// hora formago ISO
		LocalTime hAgora= LocalTime.now();
		System.out.println(LocalTime.of(21, 8));
		System.out.println(hAgora.minus(40, ChronoUnit.MINUTES));
		
		// data completa = data + hora
		LocalDateTime hd= LocalDateTime.now();
		System.out.println(hd);
		
		System.out.println(LocalDateTime.of(2020, 2,16,20,25,10));
		System.out.println("2020-2-16T20:25:10");
		System.out.println(hd.plusYears(20));
		
		// fuso horário
		ZoneId fuso= ZoneId.systemDefault();
		System.out.println(fuso);
		Set<String> fusos = ZoneId.getAvailableZoneIds();
		
		ZoneId sp= ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2020-03-17T21:24:10"), sp);
		System.out.println(zdt);
		System.out.println("2020-03-17T21:24:10-02:00[America/Sao_Paulo]");
		
		ZoneOffset offset = ZoneOffset .of("+02:00");
		OffsetDateTime offsetdt = OffsetDateTime.of(hd, offset);
		System.out.println(offset);
		
		
		Date date = new Date();
		Calendar c= Calendar.getInstance();
		LocalDateTime  ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
	}

}
