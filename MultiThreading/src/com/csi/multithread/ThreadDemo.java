package com.csi.multithread;
class Animal implements Runnable{
	public void run()
	{
		System.out.println("Animal is eating");
	}
}
public class ThreadDemo {
public static void main(String[] args) {
	Animal a=new Animal();
	Thread t=new Thread(a);
	t.start();
}
}
