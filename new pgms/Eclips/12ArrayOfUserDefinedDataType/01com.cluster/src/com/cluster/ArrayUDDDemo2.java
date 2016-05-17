package com.cluster;

public class ArrayUDDDemo2 {

	public static void main(String[] args) {
		Box[] z;// Declaring the array
		z = new Box[5];// creating of array
		Box b = new Box(0, 0, 0);
		Box b1 = new Box(1, 1, 1);
		Box b2 = new Box(2, 2, 2);
		z[0] = b;
		z[1] = b1;
		z[2] = b2;
		z[3] = new Box(3, 3, 3);
		z[4] = new Box(4, 4, 4);

		Box my = z[4];
		/*
		 * System.out.println("Val of width is "+my.width);
		 * System.out.println("Val of height is "+my.height);
		 * System.out.println("Val of depth is "+my.depth);
		 * 
		 * System.out.println(); //OR
		 * System.out.println("Val of width is "+z[4].width);
		 * System.out.println("Val of height is "+z[4].height);
		 * System.out.println("Val of depth is "+z[4].depth);
		 */
		for (int i = 0; i < z.length; i++) {
			System.out.println("Val in " + i + " index is " + z[i].width
					+ z[i].height + z[i].depth);

		}

	}

}