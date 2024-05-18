

public class MaxOf3 {

	public static void main(String[] args) {

		int a = 19, b = 17, c = 2;

		if (a > b && a > c)
			System.out.println("max is " + a);
		else if (b > a && b > c)
			System.out.println("max is " + b);
		else
			System.out.println("max is " + c);

	}

}
