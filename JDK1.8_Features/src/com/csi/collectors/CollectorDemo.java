package com.csi.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorDemo {
public static void main(String[] args) {
	List<Employee> list=new ArrayList<>();
	list.add(new Employee(101,"Vishal","Delhi"));
	list.add(new Employee(102,"Keshav","Himachal"));
	list.add(new Employee(103,"Vishu","Nashik"));
	list.add(new Employee(103,"Vishu","Nashik"));
	list.add(new Employee(103,"Vishu","Nashik"));

//Collectors->used for counting the records
	long count=list.stream().collect(Collectors.counting());
	System.out.println(count);
}
}
