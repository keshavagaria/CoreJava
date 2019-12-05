package com.csi.statics;

public class Demo {
	static{
		System.out.println("static block");
	}
	static int i;
	int j;
	void show()
	{
		i=420;
		j=50000;
		System.out.println(i);
		System.out.println("i am show"+j);
	}
	static void display()
	{
		
		i=500;
		System.out.println("i am display"+ i);
	}
public static void main(String[] args) {
	System.out.println("main block");
	System.out.println(i);
	Demo d=new Demo();
	d.show();

	display();
	
}
}
