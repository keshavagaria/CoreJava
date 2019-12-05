package com.csi.supers;
class Animals{
	void eat()
	{
		System.out.println("animal is eating");
	}
}
class Dog extends Animals{
	void eat()
	{
		super.eat();
		System.out.println("Dog is eating");
	}
}
public class SuperDemo2 {
public static void main(String[] args) {
	Dog d=new Dog();
	d.eat();
}
}
