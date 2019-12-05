package com.csi.overloading;
class Demo{
void sum(int x,float y)
{
	System.out.println(x+y);
}
void sum(float x,int y)
{
	System.out.println(x+y);
}
void sum(int x,int y,int z)
{
	System.out.println(x+y+z);
}
}
public class Test {
public static void main(String[] args) {
	Demo d=new Demo();
	d.sum(10, 10);
	d.sum(10, 20, 30);
}
}
