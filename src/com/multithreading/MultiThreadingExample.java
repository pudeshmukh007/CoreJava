package com.multithreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

interface data
{
	public static final int j = 0;
}


class Player {

Player() { System.out.print("p"); }

}

class CardPlayer extends Player implements Serializable {

CardPlayer() { System.out.print("c"); }


public static void main(String[] args) {}

}

public class MultiThreadingExample  {
	
	static void printZigZagConcat(String str, int n)
	  {
	    if (n == 1) {
	      System.out.print(str + "\n");
	    }
	    String res = "";
	    String[] arr = new String[n];
	    for (int i = 0; i < n; i++)
	      arr[i] = "";
	    boolean down = false;
	    int row = 0; // helps in building individual blocks
	    // of Strings
	 
	    for (int i = 0; i < str.length(); i++) {
	      if (row >= 0)
	        arr[row] += (str.charAt(i));
	      if (row == n - 1) {
	        down = false;
	      }
	      if (row == 0) {
	        down = true;
	      }
	      if (!down)
	        row--;
	      else
	        row++;
	    }
	 
	    for (int i = 0; i < n; i++) {
	      System.out.print(arr[i]);
	    }
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[] = {1,1,2,3,3,5,4,6,7,8};
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]%2==0 && array[j]%2==1)
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				if(array[i]%2==1 && array[j]%2==0)
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i = 0;i<array.length;i++)
		System.out.print(array[i]);
		
		
		String s0 = "hello dude";
		
		char[] c = s0.toCharArray();
		
		for(int i =0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				char temp = c[i];
				c[i]=c[j];
				c[j]=temp;
			}
			System.out.print(c[i]);
		}
		
		LinkedList linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		
		LinkedList linkedList1 = new LinkedList<>();
		linkedList1.add(1);
		linkedList1.add(2);
		linkedList1.add(3);
		
		
		
		
		String s = "bhaskar";
		String s3 = s.toString();
		String s2 = s3.toUpperCase();
		String s6 = "BHASKAR";
		String s4 = s3.toUpperCase();
		String s5 = new String("BHASKAR");
		s.toLowerCase();
		
		System.out.println(s==s3);
		System.out.println(s3==s4);
		System.out.println(s==s5);
		
		System.out.println(s2==s5);


		String name="akshaybhavsar";
		System.out.println(name.substring(2, 7));



		 }




}



