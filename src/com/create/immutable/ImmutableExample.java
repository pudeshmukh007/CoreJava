package com.create.immutable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ImmutableExample {
	
	private final int id;
	private final String name;
	private final HashMap map;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public HashMap getMap() {
		return (HashMap) map.clone();
	}
	
	public ImmutableExample(int id,String name,HashMap map) {
		
		this.id = id;
		this.name = name;
		
		HashMap hashMap = new HashMap();
		
		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry entry = (Entry) iterator.next();
			
			hashMap.put(entry.getKey(), entry.getValue());
		}
		this.map = hashMap;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> h1 = new HashMap<String,String>();
		h1.put("1", "first");
		h1.put("2", "second");
		
		String s = "original";
		
		int i=10;
		
		ImmutableExample example = new ImmutableExample(i, s, h1);
		
		// print the example values
		System.out.println("example id: "+example.getId());
		System.out.println("example name: "+example.getName());
		System.out.println("example map: "+example.getMap());
		
		// change the local variable values
		i=20;
		s="modified";
		h1.put("3", "third");
		
		System.out.println("example id after local variable change: "+example.getId());
		System.out.println("example name after local variable change: "+example.getName());
		System.out.println("example testMap after local variable change: "+example.getMap());
		
		HashMap hmTest = example.getMap();
		hmTest.put("4", "new");
		
		System.out.println("example map after changing variable from getter methods: "+example.getMap());
	}

}
