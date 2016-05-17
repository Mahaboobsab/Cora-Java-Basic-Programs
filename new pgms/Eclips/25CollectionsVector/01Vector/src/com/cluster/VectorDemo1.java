package com.cluster;

import java.util.Vector;

public class VectorDemo1 {
	
		
	public static void main(String[] args)
	{
	
	//it creates the vector of 10 and it will increment by 10 when it over filled
//	Vector vector = new Vector();
	
	//it creates the vector of 5 and it will increment by 5 when it over filled
//	Vector vector = new Vector(5);\
	
	//it creates the vector of 5 and it will increment by 3 when it over filled
	//Vector vector = new Vector(5,3);
	
	
	
	//it creates the vector of 10 
	Vector vector = new Vector();
	
	vector.add("A");
	vector.add("A");
	vector.add("A");
	vector.add("A");
	vector.add("A");
	vector.add("A");
	vector.add("A");
	vector.add("A");
	vector.add("A");
	vector.add("A");
	
	System.out.println("No of elments in the elment : "+vector.size());
	System.out.println("Capacity of the vector is "+vector.capacity());
	System.out.println("Val stored in the vector : "+vector);
	System.out.println();
	
	vector.add("A");
	
	System.out.println("No of elments in the elment : "+vector.size());
	System.out.println("Capacity of the vector is "+vector.capacity());
	System.out.println("Val stored in the vector : "+vector);
	System.out.println();
	
	vector.trimToSize();System.out.println("After triming....");
	System.out.println("No of elments in the elment : "+vector.size());
	System.out.println("Capacity of the vector is "+vector.capacity());
	System.out.println("Val stored in the vector : "+vector);

	}
}
