package com.cluster;

import java.util.Stack;

public class StackDemo2 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(new Integer(1));
		stack.push(new Integer(2));
		stack.push(new Integer(3));
		stack.push(new Integer(4));
		stack.push(new Integer(5));
		
		System.out.println("The elments inthe stack are : "+stack);
		
		//peek retrieves the elment from the top of the stack withou removing it from stack
		
		System.out.println("Top of the stack is : "+stack.peek());
		
		//pop retrives the val from stack and removes it from stack
		
		System.out.println("The elment poped out from statck is : "+stack.pop());
		
		System.out.println("The elments int he stack after poping are : "+stack);
		

	}

}
