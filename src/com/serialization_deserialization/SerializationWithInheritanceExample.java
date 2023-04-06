package com.serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 
{
	int j=12;
}
class Cat extends Dog1 implements Serializable
{
	int i=10;
}

public class SerializationWithInheritanceExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat();
		
		FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(cat);
		
		FileInputStream fileInputStream = new FileInputStream("abc.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		Cat cat1 = (Cat) inputStream.readObject();
		
		System.out.println(cat1.i+"----------------------------"+cat1.j);

	}

}
