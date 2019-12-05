package com.csi.object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Text implements Serializable{
	int i;
	int j;
	void save()
	{
		i=200;
		j=400;
		System.out.println(i+" "+j+" "+"values are saved");
	}
	@Override
	public String toString() {
		return "Text [i=" + i + ", j=" + j + "]";
	}
	
}
public class ThirdWay {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	//Serialization
	Text t=new Text();
	t.save();
	File f=new File("data.txt");
	
	FileOutputStream fos=new FileOutputStream(f);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(t);
	
	//De-Serialization
	FileInputStream fis=new FileInputStream(f);
	ObjectInputStream ois=new ObjectInputStream(fis);
	Text tt=(Text)ois.readObject();
	System.out.println(tt);
}
}
