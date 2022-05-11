package com.mindgate.main;

import com.mindgate.pojo.Acount;

public class AccountApplicationMainV2 {
	public static void main(String[] args) {
		Acount acc= new Acount(101,"Meraj",1000);
		boolean result=acc.withdraw(200);
		if(result) {
			System.out.println("Transaction is completed successfully");
			System.out.println("Balance :"+acc.getBalance());
		}
		else {
			System.out.println("Transaction failled");
			System.out.println("Balance :"+acc.getBalance());
		}
		
		System.out.println("-".repeat(50));
		
		result=acc.deposite(135);
		if(result) {
			System.out.println("Amount has been deposited");
			System.out.println("Balance :"+acc.getBalance());
		}
		else {
			System.out.println("Amount not deposited");
			System.out.println("Balance :"+acc.getBalance());
		}
	}

}
