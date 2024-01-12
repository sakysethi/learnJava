package loops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check Palindrome ...");
		
		int num = scan.nextInt();
		
		int num1 = num, rev=0, b;
		
		while(num>0) {
			
			b = num % 10;
			rev = rev*10 + b;
			num = num/10;
			
		}
		
		if (num1 == rev) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}
		
	}

}
