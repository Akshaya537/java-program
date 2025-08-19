package miniproject;
import java.util.Scanner;
public class sumofdigits {
	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sin.nextInt();
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
