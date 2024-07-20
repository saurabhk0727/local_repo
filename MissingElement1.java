import java.util.Arrays;

public class MissingElement1 {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,7,2};
		
		Arrays.sort(a);//123457
		int max=a[a.length-1];
		System.out.println("max value is   "+max);
		

		
		//1234567=n(n+1)/2=56/2=28// total sum with no missing element
		//
		int actualSum=0;
		for(int i=0;i<a.length;i++)
		{
		 actualSum=actualSum+a[i];
		}
		System.out.println(actualSum);
		
		int expectedSum=max*(max+1)/2;
		System.out.println(expectedSum);
		
		int missingElement=expectedSum-actualSum;
		System.out.println("missing elemenet is    "+missingElement);

	}

}
