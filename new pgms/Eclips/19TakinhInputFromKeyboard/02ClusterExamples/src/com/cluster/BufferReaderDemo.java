package com.cluster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args) {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Please Enter first val");
			String s1=reader.readLine();
			int x=Integer.parseInt(s1);
			System.out.println("Please Enter second val ");
			String s2=reader.readLine();
			int y=Integer.parseInt(s2);
			int z=x+y;
			System.out.println("Val of x & y is "+z);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				reader.close();
			} 
			catch (IOException e) 
		{
				
				e.printStackTrace();
			}
		}
		
	}

}
