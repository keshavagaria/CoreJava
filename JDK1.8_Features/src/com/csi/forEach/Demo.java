package com.csi.forEach;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Demo {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5,6);
	
	/*//External Iteration
	Iterator<Integer>itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	*/
	
	/*Consumer<Integer> c=new Consumer<Integer>() {
		
		@Override
		public void accept(Integer t) {
			
			System.out.println(t);
		}
	};
	list.forEach(c);*/
							
													
/*	Consumer<Integer>c=(t)-> {
						System.out.println(t);
					
				};
			
	list.forEach(c);*/
	
	list.forEach(t->System.out.println(t));
}
}
