package com.csi.object;
class Test{
	void show()
	{
		System.out.println("Showing");
	}
}
public class FirstWay {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	//Test t=new Test();
	Test tt=(Test) Class.forName("com.csi.object.Test").newInstance();
	tt.show();
}

}
