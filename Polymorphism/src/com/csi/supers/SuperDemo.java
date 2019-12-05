package com.csi.supers;
class Animal{
	String s="CUTE";
}
class Humans extends Animal{
	String s="UGLY";
	void show()
	{
		System.out.println(s);
		System.out.println(super.s);
	}
}
public class SuperDemo {
public static void main(String[] args) {
	Humans human=new Humans();
	human.show();
}
}
