package com.cluster.properties;

import java.util.Properties;

public class PropertiesDemo2 {

	public static void main(String[] args) {

		Properties properties1 = new Properties();
		System.out.println("Properties is empty before adding vales: "+ properties1.isEmpty() );
		System.out.println("Size of Properties before adding values: "+ properties1.size() );
		
		// Add key/value to the Properties
		properties1.put("Kumar", new Double(11.11));
		properties1.put("Ravi", new Double(22.22));
		properties1.put("Amogh", new Double(33.33));
		properties1.put("Vinay", new Double(44.44));
		properties1.put("Balaji", new Double(55.55));
		System.out.println(properties1);
		
		System.out.println("Properties is empty After adding vales: "+ properties1.isEmpty() );
		System.out.println("Size of Properties  After adding values: "+ properties1.size() );

		// using same key will update or replace the value 
		properties1.put("Ravi", new Double(99.99));
		System.out.println(properties1);
		
		// getting a value using a key
				Object e1 = properties1.get("Ravi");
				System.out.println("Value of Ravi is: " + e1);
				

				Object e2 = properties1.get("Tom");
				System.out.println("Value of Tom is: " + e2);
				
				properties1.remove("Vinay");
				System.out.println("Values in Properties after deleting: " + properties1);
				
				boolean b = properties1.containsKey("Ravi"); // 1.2 method
				boolean b1 = properties1.contains("Rama"); // 1.0 method
				System.out.println("Key Ravi is present: " +b);
				System.out.println("Key Rama is present: " + b1);
				
				
				System.out.println(properties1.containsValue("33.33"));
				System.out.println(properties1.containsValue(new Double(33.33)));
				
				properties1.clear();
				System.out.println("Values in Properties after clearing: " + properties1);
		
	}

}
