package loops;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to print Reverse");
	
		String s = scan.next();
		
		int len = s.length();
		
		for (int i=(len-1); i>=0; i--) {
			
			System.out.print(s.charAt(i));
		}
				
	}

}
