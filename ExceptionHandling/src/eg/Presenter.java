package eg;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Presenter {

	public static void main(String[] args)  {
		
			BussinessLogic bl= new BussinessLogic();
			try {
			bl.openFile("nihar");
	} catch (FileNotFoundException e) {
		
		System.out.println(e.getMessage());
	}
			try{System.out.println("result is"+bl.divide(4, 0));
	}
catch(ArithmeticException e) {
	System.out.println(e.getMessage());
}
	try {
	Scanner s= new Scanner(System.in);
	 System.out.println("enter x");
	 int x=s.nextInt();
	
	 System.out.println("enter y");
	
	 int y=s.nextInt();
	
	 System.out.println(bl.Customdivide(x, y));}
	 catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}}
}