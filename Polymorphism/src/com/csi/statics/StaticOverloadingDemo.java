package com.csi.statics;
class Animal{
	static void show(int x)
	{
		System.out.println(x);
	}
	static void show(String s)
	{
		System.out.println(s);
	}
}
public class StaticOverloadingDemo {
public static void main(String[] args) {
	Animal.show(10);
	Animal.show("Elephant");
}
}
