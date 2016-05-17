package com.cluster;

import java.util.ArrayList;

public class StoringPrimitivesinArralist {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		
		
		System.out.println("The Size of the ArrayList Befor Adding Elments "+list.size());
		System.out.println("Contents of the arraylist Befor adding elments "+list);
		System.out.println("The arraylist is empty befor adding elments "+list.isEmpty());
		System.out.println(); 
		
		list.add(new Integer(102));
		list.add(new Integer(103));
		list.add(new Integer(105));
		list.add(new Integer(104));
		list.add(new Integer(100));
		
		System.out.println("The Size of the ArrayList Befor Adding Elments "+list.size());
		System.out.println("Contents of the arraylist Befor adding elments "+list);
		System.out.println("The arraylist is empty befor adding elments "+list.isEmpty());
		// can add an element at a specific index by using overloaded add() method
		list.add(2, new Integer(222));
		list.add(3, new Integer(109));
		System.out.println("Contents of the arraylist After adding elments 222,109 "+list);
	/*	
		list.remove(6);
		list.remove(new Integer(105));
		
		System.out.println("Contents of the arraylist After deleting elments 100,105 "+list);*/
		
		int i=list.indexOf(105);
		int q=list.indexOf(new Integer(102));
		int j=list.indexOf("105");
		System.out.println("Index of 105 is i 100 method "+i);
		System.out.println("Index of 105 j is 100 method "+j);
		System.out.println("Index of 105 q is 100 method "+j);
		
		//Fetching the val from perticulor ArrayList
		
		Object e=list.get(2);
		Integer h=(Integer)e;
		
		Object e1=list.get(5);
		Integer k=(Integer)e1;
		System.out.println("VAl present at index 2 is "+h);
		System.out.println("VAl present at index 5 is "+k);
		
		// replace an element at a particular index
		list.set(1, new Integer(420));
		
		list.remove(4);
		
		System.out.println("Contents of the arraylist After replcing with 420 elments 4 ind "+list);
		
		System.out.println("Size of ArrayList after deletions: " + list.size());
		System.out.println("Contents of ArrayList: " + list);

	}

}
