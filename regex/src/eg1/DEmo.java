package eg1;

public class DEmo {

	public static void main(String[] args) {
		String s ="haGyy445 &n*,,,  Juuuu t3 7 @ 5t5y;";
		System.out.println(s.replaceAll("[^a-z]",""));//displays lowecase numeric
		System.out.println(s.replaceAll("[^a-zA-Z0-9]","").length());//displays  length of alphanumeric 
		System.out.println(s.replaceAll("[ A-Z0-9]","")); //displays excluding Upercase alphanumeric and space

	}

}
