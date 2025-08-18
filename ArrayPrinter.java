package miniproject;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrinter {
	 public static void main(String[]args) {
		 Scanner sin=new Scanner(System.in);
		 System.out.println("enter the array size: ");
		 int size=sin.nextInt();                                                                   
		 int[]Array=new int[size];
		 System.out.println("enter"+size+"interger");
		 for(int i=0;i<size;i++) {
			 Array[i]=sin.nextInt();
		 }
		 //Arrays.sort(Array);
		 System.out.println("the array is"+Arrays.toString(Array));
	 }
	}