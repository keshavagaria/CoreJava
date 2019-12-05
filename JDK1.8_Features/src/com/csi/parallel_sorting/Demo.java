package com.csi.parallel_sorting;

import java.util.Arrays;

public class Demo {
public static void main(String[] args) {
	int[] a={1,5,9,8,6,10,};
	System.out.println("Before Sorting");
	for(int i:a)
	{
		System.out.println(i);
	}
	
	System.out.println("After Sorting");
	Arrays.parallelSort(a);
	for(int j:a)
	{
		System.out.println(j);
	}
}
}
