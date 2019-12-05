package com.csi.clone;
class Tornado implements Cloneable{
	int i;
	int j;
	@Override
	public String toString() {
		return "Tornado [i=" + i + ", j=" + j + "]";
	}
  public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class Cloning {
public static void main(String[] args) throws CloneNotSupportedException {
	Tornado t=new Tornado();
	t.i=100;
	t.j=200;
	System.out.println(t);
	//Tornado t2=t;   //shallow copy
	//this is also deep copy
	Tornado t3=(Tornado) t.clone();
	/** this is deep copy */
	/*t3.i=t.i;
	t3.j=t.j;*/
	System.out.println(t3);
	t3.j=420;
	System.out.println(t);
	System.out.println(t3);
}
}
