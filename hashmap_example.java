package miniproject;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap_example {
		public static void main(String[] args) {
	HashMap<String,Integer>map=new HashMap<>();
	/*map.put("name",1);
	map.put("prema",3);
	map.put("sai",6);
	map.put("akshi",8);
	System.out.println(map.get("prema"));*/
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the values");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println("enter the student id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the student name");
		String name=sc.nextLine();
		map.put(name,id);
	}
	System.out.println("student details: "+map);
		}
	}
	
