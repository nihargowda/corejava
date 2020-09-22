package eg;

public class Validation {
	public boolean isvalidage(int age) throws BussinessCheckedException{
		if(age<=0) {
			throw new BussinessCheckedException("age can not be 0");
			}
		if(age<18 || age>33) {
			throw new BussinessCheckedException("age cant be below 18 and above 33");
			
		}
		return true;
	}
public boolean isvalidmobilenumber(String number) throws BussinessUncheckedException{
	boolean b=false;
	if(number.matches("\\+91-[0-9]{10}")){
	b=true;
	}
	else
	{
throw new BussinessUncheckedException("this is not valid mobile number");
	}
	
	return b;
	}
}
