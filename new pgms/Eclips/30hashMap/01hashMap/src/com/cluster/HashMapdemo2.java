package com.cluster;

import java.util.HashMap;

public class HashMapdemo2 {

	public static void main(String[] args) {
		HashMap customerMap = new HashMap();
		System.out.println("HashMap is empty before adding vales: "+ customerMap.isEmpty() );
		System.out.println("Size of HashMap before adding values: "+ customerMap.size() );
		
		// Add key/value to the HashMap
		customerMap.put("Kumar", new Double(11.11));
		customerMap.put("Ravi", new Double(22.22));
		customerMap.put("Amogh", new Double(33.33));
		customerMap.put("Vinay", new Double(44.44));
		customerMap.put("Balaji", new Double(55.55));
		
		System.out.println("HashMap is empty after adding values: "+ customerMap.isEmpty() );
		System.out.println("Size of HashMap after adding values: "+ customerMap.size() );
		
		customerMap.put("Ravi", new Double(99.99));
		System.out.println(customerMap);
		
		
		//getting val using key
		
		Object e=customerMap.get("Ravi");
		System.out.println(e);
		
         Object e1=customerMap.get("Tom");
         System.out.println(e1);
         
         //deleting
         
         customerMap.remove("Vinay");
         System.out.println(customerMap);
         
         //checking Key present or not
         
       boolean b=  customerMap.containsKey("Ravi");
       boolean b1= customerMap.containsKey("Rama");
       System.out.println("Ravi is present : "+b);
       System.out.println("Rana is present : "+b1);
       
       System.out.println(customerMap.containsValue("33.33"));
    System.out.println(customerMap.containsValue(new Double(33.33)));
    customerMap.clear();
    System.out.println(customerMap);
		
		
	}

}
