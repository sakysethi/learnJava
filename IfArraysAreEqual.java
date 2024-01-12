package array;

import java.util.Arrays;

public class IfArraysAreEqual {

	public static void main(String[] args) {
		
		int[] a1 = {1,2,3,4,6};
		int[] a2 = {1,2,3,4,5};
		
		/*
		 * boolean status = Arrays.equals(a1,a2);
		 * System.out.println(status);
		 */
		
		
		int len1 = a1.length;
		int len2=a2.length;
		boolean status = true;
		
		if (len1 == len2) {
		
			for(int i=0; i<len1; i++) {
				
				if(a1[i] != a2[i]) {
				status = false;
				}
			}
		}
			
		if (status == true) {
			System.out.println("Arrays are equal..!");}
		}
	
	}		