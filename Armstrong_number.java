package Java_Imp_Programs;
public class Armstrong_number {

	public static void main(String[] args) {
		int a=153;
		int temp=a;
		int rem=0;
		int res=0;
		
		while(temp!=0) {
			rem=temp%10;
			res=res+(rem*rem*rem);
			temp=temp/10;
		}
		System.out.println(res + " is Armstrong No");
	}
	
		
}