package miniproject;

import java.util.Arrays;
import java.util.Scanner;

public class array_larger {
		public static void main(String[]args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("enter the element:");
		 int n=sin.nextInt();    
		 if(n<2) {
			 System.out.println("atleast two number required");
			 return;
		 }
		 int[]arr=new int[n];
		 System.out.println("enter the element");
		 for(int i=0;i<n;i++) {
			 arr[i]=sin.nextInt();
		 }
		 Arrays.sort(arr);
		 System.out.println("the last second largest number"+arr[n-2]);
		}
	}

