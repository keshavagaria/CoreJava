package com.csi.java;

import java.util.Scanner;

class Counter implements Runnable{

	private boolean count=true;
	 private int value=5;
	@Override
	public void run() {
		while(count)
		{
			System.out.println(value);
			value--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(value<=0)
				count=false;
		}
	
		
	}
public void stop()
{
	count=false;
}
}
public class VolatileDemo {
public static void main(String[] args) {
	Counter c=new Counter();
	Thread t1=new Thread(c);
	t1.start();
	Thread t2=new Thread(c);
	t2.start();
/*	Scanner sc=new Scanner(System.in);
	sc.nextLine();
	c.stop();
	*/
			
}
}
