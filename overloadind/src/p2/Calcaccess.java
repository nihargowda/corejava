package p2;

public class Calcaccess {

public static void main (String args[]) {
	int x=1;
	int y=2;
	int z=3;
	calc c =new calc();
	c.add(x, y);
	 
	int variable = c.add(x, y, z);
	System.out.println(variable);
	
	
	String name = c.add("nihar", "hb");
	System.out.println(name);
}
	
}
