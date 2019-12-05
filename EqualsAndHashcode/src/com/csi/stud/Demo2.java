package com.csi.stud;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo2 {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(111,"Vishal");
	map.put(222,"Ravi");
	map.put(333,"Rahul");
	
	for(Map.Entry<Integer, String>m:map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
     }
	System.out.println("\n");
	Iterator<Map.Entry<Integer,String>> itr=map.entrySet().iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
