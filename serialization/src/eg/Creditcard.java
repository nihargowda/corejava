package eg;

import java.io.Serializable;

public class Creditcard implements Serializable{
	

	
	private static final long serialVersionUID = 8068731970008784657L;
	private long ccnumber;
	private String name;
	private int cvv;

	public Creditcard() {
		
	}

	public Creditcard(long ccnumber, String name, int cvv) {
		super();
		this.ccnumber = ccnumber;
		this.name = name;
		this.cvv = cvv;
	}

	public long getCcnumber() {
		return ccnumber;
	}

	public void setCcnumber(long ccnumber) {
		this.ccnumber = ccnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Creditcard [ccnumber=" + ccnumber + ", name=" + name + ", cvv=" + cvv + "]";
	}
	

}
