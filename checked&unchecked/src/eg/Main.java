package eg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Validation v=new Validation();
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter age");
			int age=s.nextInt();
			System.out.println(v.isvalidage(age));
			System.out.println("you can enter");
			}
		catch(BussinessCheckedException e) {
			System.out.println(e.getMessage());
		}
			try{
				Scanner y= new Scanner(System.in);
			
			System.out.println("enter the mobile number");
			String number=y.next();
			System.out.println(v.isvalidmobilenumber(number));
			}
			catch(BussinessUncheckedException ee)
			{
				System.out.println(ee.getMessage());
			}

	}

}
