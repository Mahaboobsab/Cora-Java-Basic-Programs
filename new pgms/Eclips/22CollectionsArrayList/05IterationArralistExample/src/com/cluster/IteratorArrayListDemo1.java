package com.cluster;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("C");
		list.add("D");
		list.add("F");
		list.add("C");
		list.add("A");
		list.add("H");
		list.add("J");
		list.add("C");
		
		//System.out.println("Val of arrayList Are : "+list);
		
		//Acssenf rrayElments By using loops
		/*
		for (int i = 0; i < list.size(); i++) {
			Object e=list.get(i);
			String s=(String)e;
			System.out.print(s+"  ");
			
		}*/
		
		//Acsessing ArrayList using Iterator
		
		/*Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Object e=itr.next();
			String s=(String)e;
			System.out.print(s+"  ");
		}*/
		
//Can remove contents using Itertor
		//remove all c using iterator
		
		System.out.println("Contents Befor removing c "+list);
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			Object e=itr.next();
			String s = (String)e;
			if(s.equals("C"))
			{
				itr.remove();
					}
			
		}
		System.out.println();
		
		
		
	 itr=list.iterator();
	
	System.out.print("Contents of arrayList After reoving C : ");
		while(itr.hasNext())
		{
			Object e=itr.next();
			String s=(String)e;
			System.out.print(s+"  ");
		}
		
		
		
	}

}
