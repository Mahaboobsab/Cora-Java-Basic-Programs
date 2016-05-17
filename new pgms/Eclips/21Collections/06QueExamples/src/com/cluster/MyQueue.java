package com.cluster;

import java.util.LinkedList;

public class MyQueue {
	LinkedList list = new LinkedList();

	// adding values to rear end
		public void insertLast(Object item) {
			System.out.println("enqueueing: " + item);
			list.addFirst(item);
		}

		// removing values from front end
		public Object deleteFirst() {
			return list.removeFirst();
		}

		// getting the first value in the queue
		public Object first() {
			return list.getFirst();
		}

		// finding the size of the queue
		public int size() {
			return list.size();
		}

		// finding whether queue is empty
		public boolean isEmpty() {
			return list.isEmpty();
		}
	}
