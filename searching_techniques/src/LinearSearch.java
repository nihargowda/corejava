import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		String ar[]= {"hi","nihar","java","jdk","jvm","hello","nihar","jdk"};
		Scanner s= new Scanner(System.in);
		System.out.println("enter element you want to search");
		String ele=s.nextLine();
				
		boolean b= false;
		for(String f:ar) {
			if (f.equals(ele)) {
				b=true;
				break;
			}}
			if(b) {
				System.out.println("ele found ");
				
			}
			else {
				System.out.println("not found");
				
				
			
		}
		b= false;
		for(int i=0;i<ar.length;i++) {
			if(ele.equals(ar[i])) {
				b=true;
				System.out.println(ele+"found at index "+(i));
			}
			}
		
		 if(!b) {
			System.out.println("not exists");
		}

	}

}
