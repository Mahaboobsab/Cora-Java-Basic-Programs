package com.cluster;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Begin main...");
		FileInputStream fir=null;
		try
		{
			int i=0;
			fir=new FileInputStream("E:/java/Eclips/20FileOperations/01FindingFileName/src/Hello.txt");//aaa.txt
			do{
				 i=fir.read();
				if(i != -1)
				{
					char c=(char)i;
				System.out.print(c);
				}
				
			}
			while(i != -1);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) {

			e.printStackTrace();
		}
		finally
		{
			try
			{
				fir.close();
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
		

	}

}
