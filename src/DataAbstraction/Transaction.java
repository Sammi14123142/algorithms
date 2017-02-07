package DataAbstraction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Transaction implements Comparable<Transaction>{
	
	private final String who;
	private final Date when;
	private final double amount;
	
	public Transaction(String who, Date when, double amount) {
		if (!isValid(who, when, amount)) throw new IllegalArgumentException("Invalid transaction");
		this.who = who;
		this.when = when;
		this.amount = amount;
	}
	
	public Transaction(String transaction) {
		
	}
	
	public String who() {
		return who;
	}
	
	public Date when() {
		return when;
	}
	
	public double amount() {
		return amount;
	}
	
	private static boolean isValid()
	
	
	public int compareTo(Transaction arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
