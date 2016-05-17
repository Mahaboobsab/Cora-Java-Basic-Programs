package com.lluster;

import java.util.ArrayList;

public class SearchingElments {

	public static void main(String[] args) {

ArrayList list = new ArrayList();
list.add("E");
list.add("S");
list.add("D");
list.add("");
list.add("C");
list.add("Z");
System.out.println("Val in the list is  "+list);
boolean b=list.contains("Z");

System.out.println("Z is present  "+b);

boolean b1=list.contains("B");

System.out.println("B is present  "+b1);
	}

}
