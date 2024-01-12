package array;

public class SumOfElements {

	public static void main(String[] args) {
		
		int [] arr = {2,3,4,5,6,7,8,2,3,4,5,6,7,5,5,3,9,1};
		
		int sum = 0;
		
		for(int i=0; i<(arr.length); i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
	}

}
