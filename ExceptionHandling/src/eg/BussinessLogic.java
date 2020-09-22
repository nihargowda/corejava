package eg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BussinessLogic {
	
	public void openFile(String filename) throws FileNotFoundException{
		FileInputStream fi= new FileInputStream(filename);
		}
public int divide(int a,int b) throws ArithmeticException{
	return a/b;
}
public int Customdivide(int x,int y) throws ArithmeticException{
	if(x<=0 || y<0) {
		throw new ArithmeticException("x and y cant be 0 or -ve");
	}
	if(y==0) {
		throw new ArithmeticException("cant divide by 0");
	}
	return x/y;
}}
