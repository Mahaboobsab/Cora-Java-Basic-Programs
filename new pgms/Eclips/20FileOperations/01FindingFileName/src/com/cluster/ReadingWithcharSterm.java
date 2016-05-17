package com.cluster;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingWithcharSterm {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		System.out.println("Begin main...");
		FileReader reader = null;
		int i = 0;
		reader = new FileReader(
				"E:/java/Eclips/20FileOperations/01FindingFileName/src/Hello.txt");// reader
																					// =new
																					// FileReader("E:/a-p-j-abdul-kalam-2jpeg.jpg");

		do {

			i = reader.read();
			if (i != -1) {
				char c = (char) i;
				System.out.print(c);
			}
		} while (i != -1);
		reader.close();
		System.out.println();
		System.out.println("End main...");

	}

}
