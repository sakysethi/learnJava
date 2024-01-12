package JavaPrograms100;

// Program to compute the middle digit of any entered number. If the number  does not have a middle digit, it has to return the average of the middle two digits.

class ComputeMiddleDigit {

	int nthno(int m, int n) {
		int a[] = new int[100];
		int b[] = new int[100];
		int x, mm, i = 0;
		mm = m;
		while (mm != 0) {
			i = i + 1;
			x = mm % 10;
			a[i] = x;
			mm = mm / 10;
		}
		for (int j = 0; j < i; j++) {
			b[j + 1] = a[i - j];
		}
		x = b[n];
		return (x);
	}

	void inputnumber(int m) {
		int z, s, c = 0;
		z = m;
		while (z != 0) {
			z = z / 10;
			c = c + 1;
		}
		if ((c % 2) == 0) {
			int s1, s2;
			s1 = nthno(m, c / 2);
			s2 = nthno(m, (c + 2) / 2);
			s = (s1 + s2) / 2;
		} else {
			s = nthno(m, (c + 1) / 2);
		}
		System.out.println("Middle term is=" + s);
	}

}
