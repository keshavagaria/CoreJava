package com.csi.java;
class That{
	int i;
	int j;
	//to refer current class instance variable
	That(int i, int j)
	{
		this.i=i;
		this.j=j;
    }
	void display()
	{
		System.out.println(i+" "+j);
	}
	
}
public class ThisDemo {
public static void main(String[] args) {
	That t=new That(10, 20);
	t.display();
}
}
