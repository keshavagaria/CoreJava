package com.csi.method_reference;

import java.util.Arrays;
import java.util.List;

public class Test {
	static void doubleIt(int i)
	{
		System.out.println(i*2);
	}
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(1,2,3);
	
	//list.forEach(i->System.out.println(i));
	
	//list.forEach(System.out::println);
	
	list.forEach(Test::doubleIt);
}
}
