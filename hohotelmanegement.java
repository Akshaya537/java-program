package miniproject;

import java.util.Scanner;

public class hohotelmanegement {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int balance=0,qty,choice;
			while(true) {
				System.out.println("....... MENU.......");
				System.out.println("1.BIRYANI");
				System.out.println("2.JUICE");
				System.out.println("3.CURD RICE");
				System.out.println("4.Eter the bill");
				System.out.println("Enter your choice:");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.print("BIRYANI");
					qty=sc.nextInt();
					balance+=qty*100;
					break;
				case 2:
					System.out.print("JUICE");
					qty=sc.nextInt();
					balance+=qty*100;
					break;
				case 3:
					System.out.print("CURD RICE");
					qty=sc.nextInt();
					balance+=qty*100;
					break;
				case 4:
					System.out.print("total bill(before final added)"+balance);
					break;
					default:
					System.out.print("invalid choice!");
					if(choice==4) {
					balance+=balance;
					System.out.println("total bill(aftr added)"+balance);
					break;
						}
				}
				
			}
		}
	}



