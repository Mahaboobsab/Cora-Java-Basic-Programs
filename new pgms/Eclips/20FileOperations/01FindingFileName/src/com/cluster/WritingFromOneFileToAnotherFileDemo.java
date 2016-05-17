package com.cluster;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WritingFromOneFileToAnotherFileDemo {

	public static void main(String[] args) throws Exception
	{
		System.out.println("Begin main...");
		FileInputStream fin = null;
		FileOutputStream fout=null;
		int i=0;
		fin = new FileInputStream("E:/java/Eclips/20FileOperations/01FindingFileName/src/Hello.txt");
		fout= new FileOutputStream("E:/java/Eclips/test.txt");
		fout= new FileOutputStream("E:/java/Eclips/test2.txt");
		do
		{
			i=fin.read();
			if(i != -1)
			{
				fout.write(i);
			}
		}
		while (i != -1);
		fin.close();
		fout.close();
		System.out.println("End main");

	}

}
