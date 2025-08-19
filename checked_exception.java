package miniproject;


class collegetime extends Exception{
	collegetime(String msg){
		super(msg);
	}
}
public class checked_exception {
	private static Object equalto;
	static void check() {
		String time="9:30";

		try {
			if(time.equals("9:30")) {
				throw new collegetime("student dose not allow to college ");
			}
			else {
				System.out.println("allow to college");
			}
		}
		catch(collegetime e) {
			e.printStackTrace();
		}
	}
		public static void main(String[]args) {
			checked_exception.check();
		}

}