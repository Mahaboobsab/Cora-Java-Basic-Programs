package com.cluster;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileDemo {

	public static void main(String[] args) {
		try
		{

		FileInputStream fis = new FileInputStream("cluster.properties");
		Properties prop = new Properties();
		//load the properties from the file
		prop.load(fis);
		//print all val to console
		prop.list(System.out);
		
		//get Val using Key
		String s=prop.getProperty("Karnataka");
		System.out.println("Val of Karnataka is : "+s);
		
		//Get All keys and Iterate
		Set s1 =prop.keySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			String name = itr.next().toString();
			System.out.println("Val of Keys is : "+name);
		}
		// get all the keys and iterate using Enumeration
		
		
		Enumeration e=prop.propertyNames();  //1.0 method
		while(e.hasMoreElements())
		{
			String ss=e.nextElement().toString();
			System.out.println("Val of state is "+ss);
		}
		
		
		//Store both key and Avl to another File
		FileOutputStream fos= new FileOutputStream("hello.properties");
		prop.store(fos, "My new File");
		System.out.println("Finishing Storing...");
		
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(IOException e)
		{
			System.out.println("Problem with IO");
		}
		
	}

}
