package loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a numer to print Reverse");
  
		int num = scan.nextInt();
		
	
	int numR=0, n=0;
	
	while (num>0) {
		
		n = num%10;
		num=num/10;
		numR = numR*10 +n; 

	}
	
	System.out.println("Reverse of number is " +numR);

	}
	
}