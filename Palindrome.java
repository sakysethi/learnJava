package JavaPrograms100;

// A palindrome number is one that reads same from left to right or right to left. There is an ingenious method to get a palindrome from any positive integer. The procedure is as follows: Start with any positive number of 2 or more digits. Obtain another positive number by reversing the digits of the starting number. Add the two numbers together. Repeat the whole procedure with the sum as the starting number till you get a sum which is a palindrome number.

// Program to calculate the palindrome of a given number in maximum 15 terms. Assume that the starting number is not a palindrome. Sample Input: 87. Output: 4884 Steps: 4

class Palindrome

{
	int reverse(int x) {
		int s, t = 0;
		while (x != 0) {
			s = x % 10;
			t = (t * 10) + s;
			x = x / 10;
		}
		return (t);
	}

	int palin(int x) {
		int s, t = 0, r;
		r = x;
		while (r != 0) {
			s = r % 10;
			t = (t * 10) + s;
			r = r / 10;
		}
		if (t == x) {
			return (1);
		} else {
			return (0);
		}
	}

	void palcal(int n) {
		int r, c = 1, p, n1;
		n1 = n;
		int flag = 1;
		for (int i = 0; i < 15; i++) {
			r = reverse(n1);
			p = palin(r + n1);
			if (p == 1) {
				System.out.println("Initial Number:" + n);
				System.out.println("Number is:" + (r + n1) + " which is palindrome in step " + c);
				flag = 0;
				break;
			} else {
				c = c + 1;
				n1 = n1 + r;
			}
		}
		if (flag == 1)
			System.out.println(
					"The Program is Terminated because it has exceded 15 steps and Palindrome was not achieved!");
	}
}
