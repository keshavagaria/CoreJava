 package com.csi.sync;
class Table{
	synchronized public void print(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Thread1 extends Thread{
	Table t;
	public Thread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.print(5);
	}
}
class Thread2 extends Thread{
	Table t;
	public Thread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.print(10);
	}
}
class Thread3 extends Thread{
Table t;
public Thread3(Table t) {
	this.t=t;
}
public void run()
{
	t.print(100);
}
}
public class SyncDemo {
public static void main(String[] args) {
	Table t=new Table();
	Thread1 t1=new Thread1(t);
	Thread2 t2=new Thread2(t);
	Thread3 t3=new Thread3(t);
	
	t1.start();
	t2.start();
	t3.start();
}
}
