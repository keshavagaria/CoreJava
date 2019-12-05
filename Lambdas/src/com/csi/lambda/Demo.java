package com.csi.lambda;
class Hi implements Runnable{

	@Override
	public void run() {
		for(int i=10;i<=20;i++){
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
class Hello implements Runnable{

	@Override
	public void run() {
	for(int i=100;i<=110;i++)
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
public class Demo {
public static void main(String[] args) {
	Runnable run1=new Hi();
	Runnable run2=new Hello();
	Thread t1=new Thread(run1);
	Thread t2=new Thread(run2);
	t1.start();
	t2.start();
	
}
}
