

package com.cluster1;

public class SubstringDemo {

	public static void main(String[] args) {
		/*String s1 = "Apple";
		System.out.println(s1);
		System.out.println(s1.substring(2, 4));
		
		String s2 = "Abcdef";// strats from 0 takes one string below e.g=2 to 5
								// is Strat from 2 to 4
		System.out.println("VAl of 2 in s2 abcde string is "+s2.substring(2));
		System.out.println(s2);
		String s4=(s2.substring(2, 5));
		System.out.println(s4);
		System.out.println("VAl of 2 in sun string is "+s4.substring(1));*/
		//
		
		/*	//trim	
		String s5=" ab c ";
		System.out.println("VAl of s5 is"+s5);
		//trims removes befor and after spaces not midddle
		String trims2= s5.trim();
		System.out.println("Val of s5 after trim is"+trims2);
		System.out.println("Val of trims2"+trims2);*/
		//split()
		 /*String s3 = "Hello guys how are you";
			String []as3 = s3.split("o");
			for (int i = 0; i < as3.length; i++) {
				System.out.println(as3[i]);
			}*/
		/*String s4= "WEl come to bangaluru and cluster Meheboob";
		String []split =s4.split("e");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			
		}
*/
		
		
		/*//replace() and repalceAll()
		String s4 = "aaBBccDD";
		String rep1 = s4.replace('a','x');
		String rep2 = s4.replaceAll("cc", "Xxx");
		System.out.println("Value of s4 after replace "+s4);
		System.out.println("Value of rep1 "+rep1);
		System.out.println("Value of rep2 "+rep2);*/
		
		//startsWith() and endsWith()
		/*String s5 = "Cluster";
		System.out.println("s5 starts with " + s5.startsWith("clu"));
		System.out.println("s5 starts with " + s5.endsWith("ter"));*/
		
		/*//intrn
		String s6="world";
		String s7=new String("world");
		if(s6==s7)
		{
			System.out.println("s6 & s7 are equal befor inturn");
		}
		
		else
		{
			System.out.println("s6 & s7 are not equal befor inturn");
		}
		
		// intern() method provides the reference of the String inside the pool
		s7=s7.intern();
		if(s6==s7)
		{
			System.out.println("s6 & s7 are equal befor inturn");
		}
		
		else
		{
			System.out.println("s6 & s7 are not equal befor inturn");
		}*/
		
		//valueof()
		
		//valueof() is used to convert primitive to string
		
		/*String s8=String.valueOf(99);
		System.out.println("String representation of int is "+s8);
		boolean b=true;
		String s9=String.valueOf(b);
		System.out.println("String representation of boolen is "+s9);
		*/

		/*String s10 = "HelloWorld";
	System.out.println("Value of s10 is " + s10);
	System.out.println("length of the string is "+s10.length());
	System.out.println("Value of char at 2 index is "+ s10.charAt(5));
	System.out.println("Index of l is "+ s10.indexOf("l"));
	System.out.println("Index of l is "+ s10.lastIndexOf("l"));*/

	/*
	String s10="HelloWorld";
	System.out.println("Val of s10 is "+s10);
	System.out.println("length of s10 is"+s10.length());
	System.out.println("Val of chr 2 of s10 is"+s10.charAt(2));
	System.out.println("Index of l in s10 is"+s10.indexOf("l"));
	System.out.println("Index of lby lastIndex() in s10 is"+s10.lastIndexOf("l"));*/
	
		/*String s11="Meheboob";
		System.out.println(s11.toLowerCase());
		System.out.println(s11.toUpperCase());
	*/
		//Equlls ignoring
		//Checks the equality ignoring the case
		/*String s12="Hello";
		String s13="hElLo";
		System.out.println("Checking the equality ignoring the case "+s12.equalsIgnoreCase(s13));*/
}
	}

