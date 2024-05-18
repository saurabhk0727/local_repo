

public class MaxOf3UsingTernary {

	public static void main(String[] args) {
		int a = 99, b = 77, c = 92;
		
		
		int max=(a>b)?(a>c?a:c):(b>c?b:c);
		
		System.out.println("max is " +max);

	}

}
