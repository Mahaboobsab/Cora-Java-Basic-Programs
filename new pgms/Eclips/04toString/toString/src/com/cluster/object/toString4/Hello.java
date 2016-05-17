package com.cluster.object.toString4;

public class Hello {
	int x;
	int y;
	public Hello(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		String s1="val of x and y is  "+x+"\t"+y;
		return s1;
	}
}
