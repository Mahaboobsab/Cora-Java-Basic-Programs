package com.cluster;

public class ArrayUDDDemo3DeclaringCreatingInitiating {

	public static void main(String[] args) {

		//Box z[];//Declaring the areeay
		//z=new Box[5];//Creating the array
		//Box z[]=new Box[5];//Declaring the areeay//Creating the array
		Box b=new Box(0,0,0);
		Box b1=new Box(1,1,1);
		Box b2=new Box(2,2,2);
		Box z[]={b,b,b2,new Box(3,3,3),new Box(4,4,4)};
		
		
		for (int i = 0; i < z.length; i++) {
			System.out.println("Val in " + i + " index is " + z[i].width
					+ z[i].height + z[i].depth);
		}
		
		
		
		/*
		for (int i = 0; i < z.length; i++) {
			System.out.println(z[i]);
		}
		*/
		
		
	}

}
