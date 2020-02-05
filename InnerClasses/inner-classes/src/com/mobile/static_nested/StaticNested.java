package com.mobile.static_nested;

public interface StaticNested {
	void display();
	void show();
	int x=500;
	class StaticInner{
		public void display()
		{
			System.out.println("Hello Baby from Inner Class with value "+x);
		}
	}
}

class Demo extends StaticNested.StaticInner implements StaticNested{
	public static void main(String[] args) {
		Demo demo=new Demo();
		StaticNested.StaticInner inner=new StaticNested.StaticInner();
		StaticNested outer=new Demo();
		demo.display();
		inner.display();
		outer.display();
		
	demo.show();
	outer.show();
	
	}
	

	@Override
	public void show() {
		System.out.println("Hello Showing from outside");
		
	}
	public void display()
	{
		System.out.println("Hi Displaying from outside");
	}
}
