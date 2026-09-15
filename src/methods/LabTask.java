package methods;

public class LabTask {

	public static void main(String[] args) {
		int a = 1045;
		int b = 2065;
		int c = a + b;
		a = c - a;
		b = c - a;
		System.out.println(a);
		System.out.println(b);
		int x = 10;
		int y = 6;
		int z = x ^ y;
		x = z ^ x;
		y = z ^ x;
		System.out.println(x);
		System.out.println(y);

	}

}
