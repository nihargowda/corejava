package eg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaseDEmo {

	public static void main(String[] args) {
		String s="12/04/1996";
		SimpleDateFormat sdf = new SimpleDateFormat(s);
		sdf.setLenient(false);
		try {
			Date d = sdf.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
