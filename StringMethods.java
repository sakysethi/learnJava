package StringDemo;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
		System.out.println("Enter name");
		Scanner s = new Scanner(System.in);

		String name = s.next();
		
		int len = name.length();
		
		System.out.println(len);

	}

}
