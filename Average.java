package JavaPrograms100;

// Program to input name and marks in five subjects and compute avg. and select the subjects available.
public class Average {
	private int x;

	public void result(String n, int a, int b, int c, int d, int e) {
		x = (a + b + c + d + e) / 5;
		if (x >= 90)
			System.out.println("science with computers");
		else if (x >= 80 && x <= 89)
			System.out.println("science without computers");
		else if (x >= 70 && x <= 79)
			System.out.println("commerce with maths");
		else if (x >= 60 && x <= 69)
			System.out.println("commerce without maths");
		System.out.println(n);
	}
}
