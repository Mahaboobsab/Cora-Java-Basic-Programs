package com.cluster;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDissimilarDataIterationDemo3 {

	public static void main(String[] args) {
		// Adding dissimilor elments into an array
		
		ArrayList ListBalance = new ArrayList();
		ListBalance.add("6000");
		ListBalance.add(new Integer(100));
		ListBalance.add(new Double(1000.555));
		
		System.out.println("ArrayList : Balance Are " +ListBalance);
		
		//Iterating Through Disssimilor Objects
		
		Iterator itr= ListBalance.iterator();
		
		while(itr.hasNext())
		{
			Object e=itr.next();
			//System.out.println("ArrayList : Balance Are "+e);
			
			if(e instanceof String)
			{
			String s=(String)e;
			System.out.println("The val of string is "+s);
			}
			
			if (e instanceof Integer)
			{
				Integer i =(Integer)e;
				System.out.println("Val of integer is "+i);
			}
			
			if(e instanceof Double)
			{
				Double d=(Double)e;
				System.out.println("The double val is "+d);
			}
		}

	}

}
