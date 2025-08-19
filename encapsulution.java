package miniproject;
class student{
	private String name;
	private int rollno;
	public void setname(String name) {
		this.name=name;
	}
	public void setrollno(int rollno) {
		this.rollno=rollno;
	}
	public String getname() {
		return name;
	}
	public int getrollno() {
		return rollno;
	}
}
public class encapsulution {
public static void main(String[] args) {
   student s1=new student();
   s1.setname("ravi");
   s1.setrollno(34);
   System.out.println("name:"+s1.getname());
   System.out.println("rollno:"+s1.getrollno());

   }
}
