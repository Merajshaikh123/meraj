package com.mindgate.pojo;

public class Current extends Acount {
	private double overdraftBalance;
	
	public Current() {
		System.out.println("default constructor of current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		System.out.println("parametrised constructor of current");
	}
	@Override
	public boolean withdraw(double amount) {
		if(amount >0 ) {
			if(amount < getBalance()) {
				setBalance(getBalance()-amount);
				return true;
			}
		}
		if(amount>0 && getBalance()==0) {
			setBalance(0);
			setOverdraftBalance(getOverdraftBalance()-amount);
			return true;
		}
		

		return false;
	}
	@Override
	public boolean deposite(double amount) {
		if(amount>0 && 50000 >= getOverdraftBalance()) {
			setOverdraftBalance(getOverdraftBalance()+amount);
			return true;
		}
		if(amount>0 && 50000<=getOverdraftBalance()) {
			setBalance(getBalance()+amount);
			return true;
		}
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}
	
	

}
