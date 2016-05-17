package com.cluster;

import java.util.ArrayList;

public class ArralistToArrayDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Integer(103));
		list.add(new Integer(104));
		list.add(new Integer(109));
		list.add(new Integer(108));
		
		System.out.println("The ArrayList is : "+list);
		
		Object a[]=list.toArray();
		//visiting the elments if the array
		System.out.print("Contents of Array is :");
		for (int i = 0; i < a.length; i++) {
			Object e=a[i];
			Integer x = (Integer)e;
			
			System.out.print(x+"  ,");
			
		}
		
	}

}
