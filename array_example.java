package miniproject;

import java.util.Arrays;

public class array_example {
	public static void main(String[] args) {
		
			int []ages= {10,50,3};
			int []age=new int[5];
			age[0]=5;
			age[1]=52;
			age[2]=55;
			age[3]=56;
			age[4]=57;
		System.out.println(age);
		for(int num:age) {
			System.out.println(num);
		}
		System.out.println("string method");
		System.out.println(Arrays.toString(age));
		System.out.println("sorting");
		Arrays.sort(age);
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		System.out.println(Arrays.toString(age));
		int sum=0;
		for(int i=0;i<age.length;i++) {
			sum=sum+age[i];
			System.out.println(sum);
		}
		}
		}
	
       