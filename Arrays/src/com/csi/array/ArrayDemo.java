package com.csi.array;

public class ArrayDemo {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=1;
	a[1]=3;
	a[2]=3;
	a[3]=4;
	a[4]=100;
	
	for(int i:a) {
		System.out.println(i);
	}
}
}
