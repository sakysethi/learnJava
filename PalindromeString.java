package loops;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String to check Palindrome ...");
		
		String s = scan.next();
		String s1 = s, rev = "";
		
		int len = s.length();

		
		for(int i=len-1; i>=0; i--){
			
			rev = rev + s.charAt(i);
		}
		
		// System.out.println(rev);
		
		if (s1 == rev) {
			System.out.println("Palindrome String ..");
		}
		else {
			System.out.println("Non Palindrome String");
		}
	}

}
