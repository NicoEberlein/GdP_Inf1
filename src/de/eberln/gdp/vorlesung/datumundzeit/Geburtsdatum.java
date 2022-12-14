package de.eberln.gdp.vorlesung.datumundzeit;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Calendar;
import java.time.Instant;
import java.text.DateFormat;

import static java.text.DateFormat.MEDIUM;
import static java.text.DateFormat.FULL;

public class Geburtsdatum {

	public static void main(String[] args) {

		new Geburtsdatum();

	}

	public Geburtsdatum() {

		String geburtsdatum = geburtsdatumEinlesen();

		//SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		Date date = null;

		try{

			date = sdf.parse(geburtsdatum);
			System.out.println(date);

		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		//DateFormat
		DateFormat df = DateFormat.getDateInstance(MEDIUM);
		DateFormat dflong = DateFormat.getDateInstance(FULL);

		System.out.println(df.format(date));
		System.out.println(dflong.format(date));

		//GregorianCalendar
		TimeZone tz = TimeZone.getTimeZone("ECT");
		Calendar calendar = new GregorianCalendar(tz);

		calendar.setTime(date);

		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.YEAR));


		//Instant
		Instant instant = date.toInstant();
		System.out.println(instant.toEpochMilli());
	}

	private String geburtsdatumEinlesen() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie ihr Geburtsdatum im Format dd/MM/yyyy an.");

		String geburtsdatum = scanner.nextLine();

		return geburtsdatum;
	}



}

