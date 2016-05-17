package com.cluster;

public class DemoStack {

	public static void main(String[] args) {
	
		Mystack stack = new Mystack();
		stack.InsertToStack(new Integer(1));
		stack.InsertToStack(new Integer(5));
		stack.InsertToStack(new Integer(2));
		stack.InsertToStack(new Integer(4));
		stack.InsertToStack(new Integer(3));
		
		System.out.println();
		
		System.out.println("*****-----*****-----");
		
		System.out.println("Value top of stack "+stack.first());
		
		System.out.println();
		
		while(!stack.isEmpty())
		{
		System.out.println("Poping from stack "+stack.DeleteFirst());
		}
}
}