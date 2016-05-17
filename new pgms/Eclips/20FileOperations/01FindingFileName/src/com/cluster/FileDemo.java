package com.cluster;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		System.out.println("Begin main...");
		File f1=null;
	    f1=new File("E:/java/Eclips/20FileOperations/01FindingFileName/src/Hello.txt");
	//	f1=new File("E:/ALL SONGS");
		//f1=new File("E:/ABOUT SEMINAR AND PROJECT");
		System.out.println("The name of the file is "+f1.getName());
		System.out.println("The absulute path is "+f1.getAbsolutePath());
		System.out.println("The file is readable  "+f1.canRead());
		System.out.println("The file is writable "+f1.canWrite());
		System.out.println("The file is present "+f1.exists());
		System.out.println("The length of file is "+f1.length());
		System.out.println("End main  ...");

	}

}
