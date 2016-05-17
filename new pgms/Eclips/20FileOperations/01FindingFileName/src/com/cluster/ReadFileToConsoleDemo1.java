package com.cluster;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileToConsoleDemo1 {

	public static void main(String[] args) {
		System.out.println("Begin main...");
		FileInputStream fin=null;
		int i=0;
		try
		{
			fin= new FileInputStream("E:/java/Eclips/20FileOperations/01FindingFileName/src/Hello.txt");
			do
			{
			 i=fin.read();
			 if(i !=-1)
			 {
			char c=(char)i;
			 
			System.out.print(c);
			 }
			}
			 while(i != -1);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Inside File not found exception ");
		}
		catch (IOException e)
		{
			System.out.println("Inside IO exception ");
		}
		finally
		{
			try
			{
				fin.close();
			}
			catch(IOException e)
			{
				System.out.println("Inside catch block IO exception");
			}
		}
		

	}

}
