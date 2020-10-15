package eg;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Calculation {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalDate mydate = LocalDate.parse("12.04.1996",DateTimeFormatter.ofPattern("dd.MM.yyyy"));
	Period p = Period.between(mydate, ld);
	System.out.println(p.getYears()+ " "+p.getMonths()+" " +p.getDays());
	
			System.out.println(ChronoUnit.MONTHS.between(mydate, ld));}
}
