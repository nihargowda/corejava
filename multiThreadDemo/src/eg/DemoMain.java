package eg;

public class DemoMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t= Thread.currentThread();
		t.setName("main");
		t.setPriority(9);
		System.out.println(t);
		 
		MyThread m1= new MyThread();
		m1.setName("name is m1");
		MyThread m2= new MyThread();
		m2.setName("name is m2");
		MyThread m3= new MyThread();
		m3.setName("name is m3");
		m3.setPriority(7);
		
		
		
m1.start();
m2.start();
m3.start();
for(int i=0;i<4;i++) {
	System.out.println("from thread"+""+Thread.currentThread().getName()+""+"value of i"+""+i);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	
}
	}
	}


