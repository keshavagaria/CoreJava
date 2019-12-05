package com.csi.object;
class Test2  implements Cloneable{
	void display()
	{
		System.out.println("displaying");
	}
public Object clone() throws CloneNotSupportedException
{
	return super.clone();
}
}
public class SecondWay {
public static void main(String[] args)  {
	Test2 t=new Test2();
	Test2 tt=null;
	try {
		tt = (Test2) t.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	tt.display();
}
}
