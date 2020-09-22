package eg1;

public class Rc_NO {
	public static void main (String [] args) {
		String rc= "KA09HM0863";
		if(rc.matches("[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}")) {
			System.out.println("rc is valid");
			
		}
		else {
			System.out.println("invalid rc");
		}
	}

}
