package com.cluster;

import java.util.Vector;

public class VectorLegacyMethodDemo2 {

	public static void main(String[] args) {
	Vector vector = new Vector();
	vector.addElement("A");
	vector.addElement("C");
	vector.addElement("H");
	vector.addElement("M");
	vector.addElement(new Integer(20));
	vector.addElement(null);
	vector.addElement("A");
	
	//Adding at specific elment
	
	vector.insertElementAt("I", 2);
	System.out.println("Contents of vector list : "+vector);
	
	String s5=(String)vector.get(3);
	System.out.println(s5);
	
	
	vector.remove("A");
	System.out.println("Contents of vector list : "+vector);
	
	
	//Read operations
	
	String s=(String)vector.elementAt(3);
	System.out.println("Elment present at index 3 is : "+s);
	
	String s1 = (String)vector.firstElement();
	System.out.println("Elment present at FirstElment  is : "+s1);
	
	String s2=(String)vector.lastElement();
	System.out.println("Elment present at Last  is : "+s1);
	
	//replace elment At perticulor elment
	
	vector.setElementAt("z", 5);
	System.out.println("Z at elment 5 index is "+vector);
	
	//removing elment
	
	vector.remove(4);
	System.out.println(" elment 4 removing index is "+vector);
	
	vector.remove("C");
	System.out.println(" elment C removing index is "+vector);
	vector.removeAllElements();
	System.out.println(" After removeAllElements "+vector);

	
	

	}

}
