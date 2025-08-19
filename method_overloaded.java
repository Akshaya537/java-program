package miniproject;
class a{
	void print() {
	System.out.println("it is a method A");
	}
}
class b extends a{
	void print() {
		//super.print();
	System.out.println("it is a method B");
	}

}
public class method_overloaded {
public static void main(String[] args) {
	a d1=new b();
	d1.print();
	System.out.println(d1);

}
}
