package com.csi.multithread;
class Movie extends Thread{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Hello I am Daemon Thread");
		}
		else {
			System.out.println("Hello I am User Thread");
		}
	}
}
public class Daemon {
public static void main(String[] args) {
	Movie m1=new Movie();
	Movie m2=new Movie();
	Movie m3=new Movie();
	
	m1.setDaemon(true);

	m1.start();

	m2.start();
	m3.start();
}
}
