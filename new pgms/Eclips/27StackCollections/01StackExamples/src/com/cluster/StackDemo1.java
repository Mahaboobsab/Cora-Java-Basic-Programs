package com.cluster;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		// create stack object
		Stack stack = new Stack();
		
		System.out.println("Size of the stack is : "+stack.size());
		System.out.println("Stack is empty befor filling values : "+stack.isEmpty());
		System.out.println("Val in stack is : "+stack);
		
		stack.push(new Integer(1));
		stack.push(new Integer(2));
		stack.push(new Integer(3));
		stack.push(new Integer(4));
		stack.push(new Integer(5));
		
		
		System.out.println("Size of the stack is : "+stack.size());
		System.out.println("Stack is empty befor filling values : "+stack.isEmpty());
		System.out.println("Val in stack is : "+stack);
		

	}

}
