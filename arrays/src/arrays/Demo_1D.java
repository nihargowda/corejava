package arrays;

import java.util.Arrays;

public class Demo_1D {

	public static void main(String[] args) {
		int ar[]= {1,5,6,2,1,4,3,4,4};
		System.out.println("iterating using for loop");
		for (int i = 0; i < ar.length; i++) {
			System.out.println( ar[i]);
			
		}
		System.out.println("iterating uising for_each loop");
		for(int x:ar) {
System.out.println(x);
		}	
		int ar1[]=new int[10];
		ar1[0]= 2;
		ar1[1]=3;
		ar1[2]=6;
		ar1[3]=4;
		ar1[4]=1;
		ar1[5]=9;
		System.out.println("printing ar1");
		for (int y:ar1) {
			System.out.print(y+" ");
		}
		int newelement=5;
		int pos=2;
		int n=6;
		System.out.println("\ninserting 5 at position 2 (i.e., index 1)");
		for(int i=n;i>=pos;i--) {
			ar1[i]=ar1[i-1];
					
		}
		ar1[pos-1]= newelement;
		n++;
		for(int z:ar1) {
			System.out.print(z+" ");
		}
		System.out.println("\ndeleting the element at position 3 ");
		pos=3;
		for (int i=pos-1; i < n; i++) {
			ar1[i]=ar1[i+1];
		}
		n--;	
		
		for(int r:ar1) {
			System.out.print(r+" ");
		}
		System.out.println("\n");
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("\n"+Arrays.toString(ar));
		
		
		
	}

}
