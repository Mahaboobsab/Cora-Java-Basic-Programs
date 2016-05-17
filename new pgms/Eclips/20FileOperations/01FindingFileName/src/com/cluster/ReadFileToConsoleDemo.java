package com.cluster;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileToConsoleDemo {

	public static void main(String[] args) {
		System.out.println("Begin main...");
		FileInputStream fin=null;
		try
		{
			fin= new FileInputStream("E:/java/Eclips/20FileOperations/01FindingFileName/src/Hello.txt");
			int i=fin.read();
			char c=(char)i;
			System.out.println(c);
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
