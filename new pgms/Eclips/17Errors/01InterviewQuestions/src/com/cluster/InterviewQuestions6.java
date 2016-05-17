package com.cluster;

public class InterviewQuestions6 {
	public static void main(String[] args)throws Exception 
	{
		try
		{
			System.out.println("Begin main....");
		throw new Exception();
		}
		finally
		{
			System.out.println("Inside Finally");
			System.out.println("End main");
		}
		//System.out.println("End main");
		}

	
}
