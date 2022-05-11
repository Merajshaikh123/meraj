package com.mindgate.main;

import com.mindgate.pojo.Acount;

public class AccountApplicationMain {
	public static void main(String[] args) {
		Acount acc= new Acount(101, "Meraj", 10000);
		
		System.out.println(acc.getAccountNumber());
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());
		
		System.out.println("-".repeat(50));
		
		Acount acc2=new Acount();
		acc2.setAccountNumber(102);
		acc2.setName("Meraj");
		acc2.setBalance(10050);
		
		System.out.println(acc2.getAccountNumber());
		System.out.println(acc2.getName());
		System.out.println(acc2.getBalance());
		
		
		
		
	}

}
