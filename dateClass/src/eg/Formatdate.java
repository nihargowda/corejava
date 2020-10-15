package eg;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatdate {

	public static void main(String[] args) {
		
Date d= new Date();
System.out.println(d);
SimpleDateFormat sdf = new SimpleDateFormat("dd - MM - yyyy EEEE -HH- hh  mm a z Z");
System.out.println(sdf.format(d));
	}

}
