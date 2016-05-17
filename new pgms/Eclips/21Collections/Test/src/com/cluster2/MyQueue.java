package com.cluster2;

import java.util.LinkedList;

public class MyQueue {
	LinkedList list = new LinkedList();
		
	public void insertLast(Object item)
	{
		System.out.println("Enqueing : "+item);
		list.addFirst(item);
	}
	
	/*public Object first(){
	
		return list.getFirst();
	}*/
	
	public Object first() {
     return list.getLast();
	}
	
	
	Object deleteFirst()
	{
		return list.removeLast();
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public int size()
	{
		return list.size();
	}
}