package AccountSample;

public class Account {
	
			private double balance;
			private String name;
			
			public Account(double balance, String name) {
				this.balance = balance;
				this.name = name;
			}
			
			public double getBalance() {
				return balance;
			}
			
			public void setBalance(double balance) {
				this.balance = balance;
			}
			
			public String getName() {
				return name;
			}
			
			public void setName(String name) {
				this.name = name;
			}
			
			public void withdraw(double withdrawAmount) {
				this.balance = balance - withdrawAmount;
			}
		
			public void deposit(double depositAmount) {
				this.balance = balance + depositAmount;
			}
}
