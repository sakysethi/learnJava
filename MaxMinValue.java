package array;

public class MaxMinValue {

	public static void main(String[] args) {
		
		int[] ar = {10, 20, 30, 40, 50};
		
		int max=ar[0];
		
		int len = ar.length;
		
		for(int i=0; i<len; i++) {
			
			if (ar[i] > max) {
				max = ar[i];
			}
			
		}
		System.out.println("Max value is "+max);
	}

}
