package com.csi.functional_interface;
/*class Function implements Runnable{

	@Override
	public void run() {
		System.out.println("Running");
	}
	*/

public class FunctionalDemo {
public static void main(String[] args) {
	Runnable r=() ->{System.out.println("Run Forest Run");System.out.println("second line");};
	
	Thread t=new Thread(r);
	t.start();
}
}
