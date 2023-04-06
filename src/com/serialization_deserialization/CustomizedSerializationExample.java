package com.serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable
{
	String username = "pd";
	transient String password = "pd";
	
	private void writeObject(ObjectOutputStream outputStream) throws IOException
	{
		outputStream.defaultWriteObject();
		String ePassword = "123pd";
		outputStream.writeObject(ePassword);
	}
	private void readObject(ObjectInputStream inputStream) throws ClassNotFoundException, IOException
	{
		inputStream.defaultReadObject();
		String ecPassword = (String) inputStream.readObject();
		password = password.substring(3);
	}
}

public class CustomizedSerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		User user = new User();
		
		FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(user);
		
		FileInputStream fileInputStream = new FileInputStream("abc.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		User user2 = (User) inputStream.readObject();
		
		System.out.println(user2.username+"___________________________"+user2.password);
		

	}

}
