package com.csi.stud;

class Library{
	int i;
	public Library(int i) {
		this.i=i;
	}
}
public class Student {
public static void main(String[] args) {
	Library lib=new Library(10);
	Library lib2=new Library(10);
	Library lib3=lib2;
	System.out.println(lib.hashCode());
	System.out.println(lib2.hashCode());
	System.out.println(lib.equals(lib2));
	System.out.println(lib3.hashCode());
	System.out.println(lib2.equals(lib3));
}
}
