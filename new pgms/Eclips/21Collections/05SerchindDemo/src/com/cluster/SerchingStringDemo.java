package com.cluster;

import java.util.LinkedList;

public class SerchingStringDemo {

	public static void main(String[] args) {
		LinkedList list=new LinkedList<>();
		list.add("A");
		list.add("M");
		list.add("N");
		list.add("B");
		list.add("P");
		list.add("V");
		//list.add("p");
		System.out.println("Val present in list is "+list);
		
		
		/*//to check val present in list
		
		System.out.println("P Val present in list "+list.contains("P"));
		
		//Its case senitive
		System.out.println("p Val present in list "+list.contains("p"));*/
		
		if(list.contains("P"))
		{
			System.out.println("Val P is present");
		}
		else
			System.out.println("Val P is not present");
	

}
}