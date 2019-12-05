package com.csi.functional_interface;
interface Function{
	void draw();
}
class Test implements Function{
	public void draw()
	{
		System.out.println("Hello world");
	}
}
public class Functional2 {
public static void main(String[] args) {
	Test t=new Test();
	t.draw();
}
}
