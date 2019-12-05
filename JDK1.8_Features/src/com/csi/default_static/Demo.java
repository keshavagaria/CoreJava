package com.csi.default_static;
interface IceCream{
	void white();
	static void hello()
	{
		System.out.println("Hello from static");
	}
	default void hi()
	{
		System.out.println("hi from default");
	}
}
class Kulfi implements IceCream{

	@Override
	public void white() {
		System.out.println("i am white");
		
	}
/*	public void hi()
	{
		System.out.println("hi from child");
	}*/

}
public class Demo {
public static void main(String[] args) {
	Kulfi kk=new Kulfi();
	kk.white();
	kk.hi();
	IceCream.hello();
}
}
