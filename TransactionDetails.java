package com.learnclearly.banking;

import java.util.LinkedList;
import java.util.List;


public class TransactionDetails {

	public static List<Transaction>transactionList = new LinkedList<>();
	
	public static void addTransaction(Transaction t) {
		transactionList.add(t);
	}
	
	public static void ShowMinistatement(int actNumber) {
		System.out.println("Mini Statement for Account Number"+ actNumber);
		System.out.println();
		for(Transaction t:transactionList) {
			if (t.getActNumber()==actNumber) {
				System.out.println(t.getTrannumber()+"-"+t.getTransType()+"-"+t.getTranAmount()+"-"+t.getBalanceAfterThisTransaction());
			}
		}
		
	}
	
	
	
	
}
