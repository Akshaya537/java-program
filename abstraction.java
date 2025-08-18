package miniproject;

	interface car{
		public void engine();
		public void gears();
	}
	class bmw implements car{
		public void engine() {
			System.out.println("ve engine:238");
			System.out.println("horse power:5000");
		}
		public void gears() {
			System.out.println("automatic gears");
		}
	}
	public class abstraction {
		public static void main(String[]arg) {
		    car b1=new bmw();
			b1.engine();
			b1.gears();
	}
}
	



