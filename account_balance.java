package miniproject;

	interface rbi{
		public void deposite();
		public void withdraw();
		public void showbalance();
	}
	class bank  implements rbi{
		double amount=2000;
		double balance=1000;
		public void deposite() {
			if(amount>0) {
				balance+=amount;
				System.out.println("amount:"+amount);
				System.out.println("deposite amount:"+balance);
			}
			else {
				System.out.println("not deposite");
			}
		}
		public void withdraw() {
			int balance=5000;
					if(amount>0&&amount<=balance) {
						balance-=amount;
						System.out.println(".....");
						System.out.println("amount:"+amount);
						System.out.println("withdraw amount:"+balance);
					}
					else {
						System.out.println("no withdraw");
					}
		}
		public void showbalance() {
			System.out.println("balance:"+balance);
		}
	}
	public class account_balance {
		public static void main(String[]args) {
			rbi b1;
			b1=new bank();
			b1.deposite();
			b1.withdraw();
			b1.showbalance();
		}
	}
	