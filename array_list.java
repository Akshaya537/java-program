package miniproject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
public class array_list {
public static void main(String[]args) {

		ArrayList<Object> a1=new ArrayList<>();
		a1.add("aits");
		a1.add(7);
		a1.add(3.8);
		System.out.println(a1);
		ArrayList<Object> a2=new ArrayList<>();
		a2.add("name:");
		a2.add("prema");
		a2.add(527);
		a2.addAll(a1);
		System.out.println(a2);
		a2.add(2,"hai");
		System.out.println("after arraylist:"+a2);
	    LinkedList<String> li=new LinkedList<>();
		li.add("name:");
		li.add("prema");
		li.add("sai");
		System.out.println(a2);
		li.remove(2);
		System.out.println("after linkedlist:"+li);
		Stack<String> s=new Stack<>();
		s.push("age");
		s.push("prem");
		s.push("sai");
		System.out.println("stack:"+s);
		s.pop();
		System.out.println("stack:"+s);

		System.out.println(s.isEmpty());

		}
}


