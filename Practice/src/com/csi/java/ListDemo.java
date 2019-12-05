package com.csi.java;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
public static void main(String[] args) {
	
	int count=0;
	List<Boolean> list=new ArrayList<>();
	list.add(true);
	list.add(false);
	list.add(false);
	list.add(false);
	list.add(false);

for(Boolean b:list)
{
	if(b==true){
		count++;
		//continue;
      	
		}

}
if(count==1){
	System.out.println("valid");
}

else{
	System.out.println("invalid");
}
}
}