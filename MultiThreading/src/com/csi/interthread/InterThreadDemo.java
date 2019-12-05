package com.csi.interthread;
class Customer{
	int amount=10000;
	synchronized public void withdraw(int amount)
	{
		System.out.println("Goint to withdraw amount");
		if(this.amount<amount)
		{
			System.out.println("Insufficient balance");
			System.out.println("Waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		this.amount=-amount;
		System.out.println("Amount withdrawn successfully");
	

	}
	
	synchronized public void deposit(int amount)
	{
		System.out.println("Going to deposit the amount");
		this.amount+=amount;
		System.out.println("Amount deposited successfully");
		notify();
	}
}
public class InterThreadDemo {
public static void main(String[] args) {
	Customer c=new Customer();
	new Thread()
	{
		public void run()
		{
			c.withdraw(20000);
		}
	}.start();
	
	new Thread()
	{
		public void run()
		{
			c.deposit(30000);
		}
	}.start();
}
}
