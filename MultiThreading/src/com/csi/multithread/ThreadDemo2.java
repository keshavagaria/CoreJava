package com.csi.multithread;

class Student extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
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
public class ThreadDemo2 {
public static void main(String[] args) {
	Student s=new Student();
	Student s2=new Student();
	
	s.start();
	s2.start();
	//s2.start();
	
}
}
