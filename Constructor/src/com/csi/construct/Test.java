package com.csi.construct;
class Chair{
	private int i;
	private int j;
	private int k;
    Chair()
	{
		i=100;
		j=200;
		k=300;
		
	}
	Chair(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	Chair(int i,int j,int k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
	}
	void show()
	{
		System.out.println(i+" "+j+" "+k);
	}
}
public class Test {
public static void main(String[] args) {
	Chair c=new Chair(500,600);
	Chair cc=new Chair();
	Chair ccc=new Chair(1000,2000,3000);
	cc.show();
	c.show();
	ccc.show();
}
}
