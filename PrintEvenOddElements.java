package array;

public class PrintEvenOddElements {

	public static void main(String[] args) {
		
		int [] arr = {2,3,4,5,6,7,8,2,3,4,5,6,7,5,5,3,9,1};
		
		int len = arr.length;
		
		
		System.out.println("Even Numbers ..");
		
		for(int i=0; i<len; i++) {
			
			int a = arr[i]%2;
			
			if (a == 0) {
				System.out.print(arr[i] + ",");
			}
			
		}
		
		
	System.out.println("Odd Numbers ..");
		
		for(int i=0; i<len; i++) {
			
			int a = arr[i]%2;
			
			if (a != 0) {
				System.out.print(arr[i] + ",");
			}
			
		}
		
	}

}
