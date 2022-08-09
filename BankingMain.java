package com.learnclearly.banking;

public class BankingMain {
	public static void main(String[]args) {
		BankAccount b1 =new BankAccount(101,"Ravi",15000);
		BankAccount b2 =new BankAccount(102,"Himanshu",25000);
		b1.deposit(10000);
		b1.deposit(500);
		b1.deposit(800);
		b1.withdraw(700);
		b1.withdraw(200);
		b1.deposit(100);
		System.out.println("------------------------------------------");
		TransactionDetails.ShowMinistatement(101);
		
		System.out.println("------------------------------------------");
		b2.deposit(10000);
		b2.deposit(500);
		b2.deposit(800);
		b2.withdraw(700);
		b2.withdraw(200);
		b2.deposit(100);
		System.out.println("------------------------------------------");
		TransactionDetails.ShowMinistatement(102);
		
	}

}
