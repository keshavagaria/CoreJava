package com.csi.java;

import java.util.ArrayList;
import java.util.List;

public class Demo {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("Infosys");
	list.add("TCS");
	list.add("WIPRO");
	list.add("Accenture");
	list.add("CapGEMINI");
	
//list.forEach(t->System.out.println(t));
list.forEach(System.out::println);

}
}
