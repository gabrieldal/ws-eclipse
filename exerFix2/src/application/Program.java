package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter account number: ");
		String x = sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String y = sc.nextLine();
		
		System.out.println("Is there a initial deposit? (y/n)");
		char a = sc.next().charAt(0);
		if (a == 'y') {
		System.out.println("Enter initial deposit value: ");
		double initialDeposit  = sc.nextDouble();
		account = new Account(x, y, initialDeposit);
		}else {
			account = new Account(x, y);;
		}
				

		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();

		System.out.println("Enter a deposit value");
		double z = sc.nextDouble();
		account.deposit(z);
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();

		System.out.println("Enter a withdraw value");
		z = sc.nextDouble();
		account.withdrawn(z);
		System.out.println("Updated account data: ");
		System.out.println(account);

		sc.close();
	}

}
