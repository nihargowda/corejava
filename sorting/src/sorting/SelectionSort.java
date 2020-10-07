package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int ar[]= {5,9,6,3,4,21,12};
		selection(ar);
	System.out.println(Arrays.toString(ar));
	}
	
	

public static void selection(int ar[]) {
	for(int i=0;i<ar.length-1;i++) {
		int min=i;
		for(int j=i+1;j<ar.length;j++) {
			if(ar[j]<ar[min]) {
				min=j;
			}
		}
		int temp=ar[min];
		ar[min]=ar[i];
		ar[i]=temp;
	}

}

	}
	



