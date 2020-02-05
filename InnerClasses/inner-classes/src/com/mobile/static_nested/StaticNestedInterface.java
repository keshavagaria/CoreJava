package com.mobile.static_nested;

public interface StaticNestedInterface {
	void outer();
		interface Inner{
			void inner();
		}
}
class Testing implements StaticNestedInterface.Inner,StaticNestedInterface{
	
	public static void main(String[] args) {
		Testing testing=new Testing();
		StaticNestedInterface.Inner inner=new Testing();
		
		StaticNestedInterface outer=new Testing();
		
		
		testing.inner();
		inner.inner();
		
		outer.outer();
		testing.outer();
	}

	@Override
	public void inner() {
		System.out.println("Hello I am from Nested Interface");
	}

	@Override
	public void outer() {
		System.out.println("Hello I am  from Outer Interface");
		
	}
}
