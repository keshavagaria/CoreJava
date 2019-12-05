package com.csi.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
public static void main(String[] args) {
	Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
	ht.put(101, "TOM CRUISE");
	ht.put(51, "TOM HARDY");
	ht.put(41, "CRISTIAN BALE");
	ht.put(201, "KEANU REEVES");
	ht.put(100, "GEORGE CLOONEY");
	//ht.put(null, "TOBEY");
	//ht.put(5, null);

	//ht.put(6, null);

	
	
	for(Map.Entry<Integer, String> map:ht.entrySet())
	{
		System.out.println(map.getKey()+" "+map.getValue());
	}
}
}
