package com.csi.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector<String> v=new Vector<>();
	v.add("One");
	v.add("Two");
	v.add("One");
	v.add("Three");
	v.add("Four");
	v.add("Five");
	v.add("Six");
	v.add("Four");
	v.add("Five");
	v.add("Six");
	v.add("Six");
	System.out.println(v.capacity());
	for(String i:v)
	{
		System.out.println(i);
	}
		
} 


}
