package miniproject;

import java.util.Scanner;

public class numbers_print {
 static int solution(int a,int b) {
		return a*b+3;
	}
public static void main(String[] args) {
	Scanner sin=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sin.nextInt();
	for(int i=0;i<=n;i++) {
	System.out.println("entar the a value");
	int a=sin.nextInt();
    System.out.println("enter the b values");
    int b=sin.nextInt();
    int result=solution(a,b);
     System.out.println("("+a+","+b+")="+result);
	}
	}
}
