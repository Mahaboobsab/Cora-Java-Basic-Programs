package com.cluster;

import java.util.LinkedList;

public class Mystack {
	LinkedList list = new LinkedList();
	
	public void InsertToStack(Object item)
	{
		
		System.out.println("Pushing into stack: "+item);
		list.add(item);
	}
	
	public Object first()
	{
		return list.getLast();
	}
	
	public Object DeleteFirst()
	{
		return list.removeLast();
		
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
}
