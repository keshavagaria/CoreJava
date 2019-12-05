package com.csi.multithread;

class Join extends Thread{
	public void run() 
	{
		for(int i=1;i<=5;i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class Demo3 {
public static void main(String[] args) {
	Join j1=new Join();
	Join j2=new Join();
	Join j3=new Join();
	
	j1.start();
	
	try {
		j1.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	j2.start();
	j3.start();
}
}
