package com.csi.supers;
class Animalss {
	Animalss()
	{
		System.out.println("animal is eating");
	}
}
class Dogs extends Animalss{
	Dogs()
	{
		super();
		System.out.println("Dogs are eating");
	}
	{
		System.out.println("instance initializer block");
	}
}
public class SuperDemo3 {
public static void main(String[] args) {
	Dogs d=new Dogs();
	
}
}
