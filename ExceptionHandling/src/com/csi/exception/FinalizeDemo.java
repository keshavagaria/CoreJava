package com.csi.exception;

public class FinalizeDemo {
	public void finalize()
	{
		System.out.println("object is garbage collected");
	}
public static void main(String[] args) {
	FinalizeDemo fd=new FinalizeDemo();
	fd=null;
	fd=null;
	System.gc();
}
}
