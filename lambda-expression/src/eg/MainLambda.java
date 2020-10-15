package eg;

import eg.Lambdademo.Addition;
import eg.Lambdademo.HelloFunction;

public class MainLambda {

	public static void main(String[] args) {
	HelloFunction h= ()-> System.out.println("hello lambda");
h.hello();
	
	Addition a= (x,y,z)-> {
		return x+y+z;
				} ;
	System.out.println(a.sum(1,4,9));

	
	}

}
