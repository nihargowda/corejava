package searching_techniques;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int ar[]= {1,3,5,8,6,5,22,11,4,44,35};
		Arrays.sort(ar);
		System.out.println(Arrays.binarySearch(ar, 00));
		myBinary(ar,0,11,ar.length-1);
		
	}
	public  static void myBinary(int ar[],int start, int key,int length) {
		int mid = (start+length)/2;
		while(start<=length) {
			if(ar[mid]== key) {
				System.out.println(key+"found at"+mid);
				break;}
				else if(ar[mid]<key) {
					start=mid+1;}
					else {
						length=mid-1;
						}
				mid=(start+length)/2;
				
				}
				if(start>length) {
				System.out.println("not found");
				
			
			
	}}

}
