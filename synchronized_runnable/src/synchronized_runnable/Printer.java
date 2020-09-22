package synchronized_runnable;

public class Printer {
public synchronized static void printpages(Page a) {
	System.out.println(a.getPage1());
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	System.out.println(a.getPage2());
}
}
