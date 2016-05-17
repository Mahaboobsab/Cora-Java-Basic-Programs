package com.cluster;

public class Box {
	int width;
	int height;
	int depth;
	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	int volume()
	{
		int vol=width*height*depth;
		return vol;
		
	}

}
