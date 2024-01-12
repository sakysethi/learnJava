package JavaPrograms100;

// to extract and display the maximum prime digit from a number
class maxprimedigit {
	public void compute(int c) {
		int b;
		int n, big = 0, d, count = 0, i;

		do {
			n = c % 10;
			for (i = 1; i <= n; i++) {
				if (n % i == 0)
					count = count + 1;
			}
			if (count == 2) {
				if (big < n)
					big = n;
				count = 0;
			}
			count = 0;
			c = c / 10;
		}

		while (c != 0);
		System.out.println(big + "is the maximum prime digit number");
	}
}
