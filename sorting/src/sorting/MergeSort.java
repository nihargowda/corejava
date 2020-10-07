package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int ar[]= {3,1,6,4,88,54,66,39,9};
		System.out.println("before sorting\n"+Arrays.toString(ar));
		mergeing(ar);
		System.out.println("after sorting\n"+Arrays.toString(ar));

	}
	public static void mergeing(int ar[]) {
		if(ar.length>1) {
		int mid=ar.length/2;
		int left[]=  new int[mid];
		for(int i=0;i<left.length;i++) {
			left[i]=ar[i];
		}
		int right[]=new int[ar.length-mid];
		for(int i=mid;i<ar.length;i++) {
			right[i-mid]=ar[i];
		}
		mergeing(left);
		mergeing(right);
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				ar[k]=left[i];
						i++;
			}
			else {
				ar[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length) {
			ar[k++]=left[i++];
		}
		while(j<right.length) {
			ar[k++]=right[j++];
		}
			
		}}

	}
		
		
		
		
		
				

	

