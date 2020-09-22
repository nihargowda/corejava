package packs;

public class Thisdemo {
	private int employeeid;
private String employename;
private int age;
private long contact;

	public Thisdemo() {
		// TODO Auto-generated constructor stub
	}

	public Thisdemo(int employeeid, String employename) {
		
		this.employeeid = employeeid;
		this.employename = employename;
	}

	public Thisdemo(int employeeid, String employename, int age, long contact) {
		
		this(employeeid,employename); // constructor chaining
		this.age = age;
		this.contact = contact;
	}
	 public void printvalues() {
		 System.out.println(employeeid);
		 System.out.println(employename);
		 System.out.println(age);
		 System.out.println(contact);
	 }
	 

}
