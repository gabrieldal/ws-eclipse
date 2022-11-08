package entities;

public class Account {
	
	private String number;
	private String holder;
	private double balance;
	
	public Account (String number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	public Account(String number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public void getNumber(String number) {
		this.number = number;
	}


	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	public void withdrawn(double amount) {
		balance -= amount - 5.0;
	}
	@Override
	public String toString() {
		return "Account number =" + number + ", holder =" + holder + ", balance = $" + String.format("%.2f", balance);
	}
	
}
