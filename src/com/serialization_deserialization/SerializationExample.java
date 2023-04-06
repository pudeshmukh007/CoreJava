package com.serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable
{
	int i=10;
	//transient keyword we can write with variable only for deserilize that value
	transient int j=20;
}

public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog();
		
		System.out.println(dog.i+"---------------------------"+dog.j);
		
		//serialization start
		FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(dog);
		//serialization end
		
		//deserialization start
		FileInputStream fileInputStream = new FileInputStream("abc.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Dog dog1 = (Dog) objectInputStream.readObject();
		//deserialization end
		
		
		System.out.println(dog1.i+"---------------------------"+dog1.j);

	}

}
