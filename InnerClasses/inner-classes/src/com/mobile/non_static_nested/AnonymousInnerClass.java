package com.mobile.non_static_nested;

abstract class Animal{
	abstract void eating();
}

interface Humans{
	void protest();
}

public class AnonymousInnerClass {
public static void main(String[] args) {
	Animal animal=new Animal() {
		
		@Override
		void eating() {
		System.out.println("Animal is eating");
			
		}
	};
	animal.eating();
	
	Humans humans=new Humans() {
		
		@Override
		public void protest() {
			System.out.println("Hunams are protesting");
			
		}
	};
	
	humans.protest();
}
}
