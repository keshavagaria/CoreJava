package com.csi.lambda;
/*class A implements Runnable{
	
}
class B implements Runnable{
}
	*/

public class Anonymous {
public static void main(String[] args) {
	Runnable run1=new Runnable()
			{
					public void run()
					{
						for(int i=1;i<=5;i++)
						{
						System.out.println(i*10);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						}
						
					}
			};
			
	Runnable run2=new Runnable()
			{	
					public void run()
					{
						for(int i=1;i<=5;i++)
						{
						System.out.println(i*2);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						}
					}
			};
			
			Thread t1=new Thread(run1);
			Thread t2=new Thread(run2);
			t1.start();
			t2.start();
}
}
