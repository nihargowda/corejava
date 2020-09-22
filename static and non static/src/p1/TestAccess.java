package p1;

public class TestAccess{
	
public static void main(String [] args) {
	Testclass t1= new Testclass();
	Testclass.innerpublic t2 = t1.new innerpublic();
	t2.method3();
	
	Testclass.innerstatic.method1();
	 
	Testclass.innerstatic q1= new Testclass.innerstatic();
	q1.method2();
}
}