package eg1;

public class Demo2 {
	public static void main(String [] args) {
		String pan= "BCHPN7890G";
		if (pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")){
			System.out.println("pan "+ pan +" is valid");
		}
		else {
			System.out.println("pan"+pan+"is invalid");
		}
	
	}

}
