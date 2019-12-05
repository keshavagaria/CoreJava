package com.csi.java;
class Tests{
	/*void add(int x){
		System.out.println(x);
	}*/
	void add(long x){
		System.out.println(x);
	}
	void add(Integer x)
	{
		System.out.println(x);
	}
}
public class Demo {
public static void main(String[] args) {
	Tests t=new Tests();
	t.add(500);
	t.add(600);
}
}
