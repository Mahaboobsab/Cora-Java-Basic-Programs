package com.cluster.properties;

import java.util.Properties;

public class PropertiesDemo1 {

	public static void main(String[] args) {
		// Creates Properties Object
		
		Properties properties = new  Properties();
		properties.put("Amma", new Double(1000.00));
		properties.put("Meheboob", new Double(777.77));
		properties.put("Nabibayya", new Double(666.66));
		properties.put("Sayyadabayya", new Double(444.44));
		properties.put("Biyama", new Double(333.33));
		
		System.out.println(properties);
		
		// can add different type of key in Properties
		properties.put(new Integer(101), new Double(12.66));
		System.out.println(properties);
		
		//can Add duplicte VAl 
		properties.put("Sabiya", new Double(777.77));
		System.out.println(properties);
		
		//can Add different type of Val
		properties.put("MEHBOOB", "mehboob");
		System.out.println(properties);
		
		
		
		//cannot Add null key
		//properties.put(null, new Double(11.58));
		//System.out.println(properties);
		
		//cannot Add null VAl
	//	properties.put("Hello", null);
		System.out.println(properties);
		
		
		
		
		
	}

}
