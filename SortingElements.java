package array;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {

		int[] ar = {10, 90, 30, 30, 70, 10};
		
		Arrays.parallelSort(ar);
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		// Reverse Order
		
		Integer[] a = {10, 90, 30, 30, 70, 10};
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(ar));
		
	}

}
