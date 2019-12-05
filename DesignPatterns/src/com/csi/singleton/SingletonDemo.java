package com.csi.singleton;
class Test{
	int i=420;
	private static Test obj=new Test();
	private Test()
	{
		
	}
	public static Test getInstance()
	{
		return obj;
	}
	@Override
	public String toString() {
		return "Test [i=" + i + "]";
	}
	
}
public class SingletonDemo {
public static void main(String[] args) {
	Test t1=Test.getInstance();
	Test t2=Test.getInstance();
	System.out.println(t1);
	System.out.println(t2);
}
}
