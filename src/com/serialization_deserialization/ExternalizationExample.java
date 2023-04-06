package com.serialization_deserialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Externalize implements Externalizable
{
	
	String s;
	int i;
	int j;
	
	public Externalize() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Externalize(String s, int i, int j) {
		super();
		this.s = s;
		this.i = i;
		this.j = j;
	}



	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(s);
		out.writeInt(i);
		//out.writeInt(j);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		s = (String) in.readObject();
		i = in.readInt();
		//j = in.readInt();
	}
}

public class ExternalizationExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Externalize externalize = new Externalize("pd",10,20);
		
		FileOutputStream outputStream = new FileOutputStream("abc.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(externalize);
		
		FileInputStream inputStream = new FileInputStream("abc.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		Externalize externalize2 = (Externalize)objectInputStream.readObject();
		
		System.out.println(externalize2.s+"=========="+externalize2.i+"==========="+externalize2.j);

	}

}
