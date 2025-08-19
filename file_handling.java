package miniproject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
public class file_handling {
		static void store() {
			try {
				FileWriter fw=new FileWriter("cse.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				String input="this is file da";
				bw.write(input);
				System.out.println("data inserted");
				bw.close();
			  }
			catch(Exception  e) {
				e.printStackTrace();
			}
		}
	public  static void main(String[]args) {
		try {
			File ff=new File("ece.txt");
			ff.createNewFile();
			System.out.println("success");

		  }
		catch(Exception e) {
			e.printStackTrace();
		}
		store();
	  }
	}