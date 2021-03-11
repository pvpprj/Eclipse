package Program;

public class Divide {

	public static int div(int a, int b) {

		if (b == 0)
			System.out.printf("Divisible no o");

		int temp = 1;
		if (a * b < 0)
			temp = -1;

		a = Math.abs(a);
		b = Math.abs(b);

		int q = 0;

		while (a >= b) {
			a = a - b;
			q++;
		}

		System.out.println("Remainder is " + a);
		return temp * q;
	}

	public static void main(String[] args) {
		int c= 67;
		int d= 2;

		System.out.println("Quotent i s " + div(c, d));	}
}
