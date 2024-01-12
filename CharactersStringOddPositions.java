package JavaPrograms100;

// Program to print the characters of the string present at odd positions.
public class CharactersStringOddPositions {

	private int x, i, l;

	public CharactersStringOddPositions() {

		x = 0;
	}

	public void array1(String a) {
		l = a.length();
		System.out.print("the characters of the string " + a + " at odd positions are:");
		for (i = 0; i < l; i++) {
			if (i % 2 != 0)
				System.out.print(a.charAt(i));
		}
	}
}
