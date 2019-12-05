package com.csi.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
public static void main(String[] args) {
	List<Product>list=new ArrayList<>();
	
	/*Product p=new Product();
	p.setId(500);
	p.setName("Samsung");
	p.setPrice(5000.65f);*/
	list.add(new Product(500,"Samsung",4555.32f));
	list.add(new Product(600,"Apple",6000.32f));
	list.add(new Product(700,"Motorola",5000.32f));

list.stream().filter(pp->pp.getId()==500).forEach(pp->System.out.println(pp.getName()));
}
}
