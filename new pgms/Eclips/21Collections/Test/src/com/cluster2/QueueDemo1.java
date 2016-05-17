package com.cluster2;

public class QueueDemo1 {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.insertLast(new Integer(6));
		queue.insertLast(new Integer(1));
		queue.insertLast(new Integer(3));
		queue.insertLast(new Integer(2));
		queue.insertLast(new Integer(5));
		
		System.out.println();
		
		System.out.println("The Sizw of queue is "+queue.size());
		System.out.println();
		
		System.out.println("**************************************");
		
		System.out.println("VAl of first index in queue is "+queue.first());
		
		while(!queue.isEmpty())
		{
			System.out.println("Dequieng  "+queue.deleteFirst());
		}
System.out.println("The Sizw of queue is "+queue.size());
	}

}
