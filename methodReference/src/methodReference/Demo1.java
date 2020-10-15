package methodReference;

public class Demo1 {
	public static void  hellostatic() {
		System.out.println("hello static");}
		public void hellonon() {
			System.out.println("hello non static");
		}
		
	

	public static void main(String[] args) {
		Hello h = Demo1::hellostatic;
		h.hey();
		Hello h2= new Demo1()::hellonon;
		h2.hey();
	}

}
@FunctionalInterface
interface Hello{
	void hey();
		
	
}
