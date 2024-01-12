package basic;

import java.util.Scanner;

public class ReplacingJunkCharacters {

	public static void main(String[] args) {
		

		String s = "&*()9878 jjdjw778&8";
		
		
		String s1 = s.replaceAll("[^a-zA-Z0-9 ]", ""); // removing special characters		
		System.out.println(s1);

		String s2 = s.replaceAll("[ ]", ""); // removing spaces			
		System.out.println(s2);
		
	}

}
