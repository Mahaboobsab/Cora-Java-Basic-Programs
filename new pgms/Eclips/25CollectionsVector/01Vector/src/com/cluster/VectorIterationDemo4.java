package com.cluster;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIterationDemo4 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.addElement("N");
		vector.addElement("A");
		vector.addElement("B");
		vector.addElement("I");
		vector.addElement("B");
		vector.addElement("B");
		vector.addElement("A");
		vector.addElement("Y");
		vector.addElement("Y");
		vector.addElement("A");
		
		System.out.println("Contents of vector list: "+vector);
		
		System.out.print("Enumeration : ");
		
		Enumeration enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			Object e = (Object) enumeration.nextElement();
			System.out.print(e+ "  ");
			
		}
		System.out.println();
		
		System.out.print("Using Iterator : ");
		Iterator iterator= vector.iterator();
		while(iterator.hasNext())
		{
			Object e=iterator.next();
			System.out.print(e+" ");
		}
			
		System.out.println();
		System.out.print("using Listiterator Forward: ");
		
		
		ListIterator listIterator =vector.listIterator();
		while(listIterator.hasNext())
		{
			Object e= listIterator.next();
			System.out.print(e+"  ");
		}

	
		System.out.println();
		
		System.out.print("Listiterator backward: ");
		
		while(listIterator.hasPrevious())
		{
			Object e=listIterator.previous();
			System.out.print(e+"  ");
		}
		
	}
	
		}


