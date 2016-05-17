package com.cluster;

class StudentnotFoundException extends Exception
{
	String msg;
	StudentnotFoundException (int s)
	{
		msg="Student ID No  "+s+" id "+"  Is not valid  ";
	}

	public String toString() //Overriding class object
	{
		
		return msg;
	}
	
	}

class Student
{
	void CheckStudent(int id)throws StudentnotFoundException
	{
		
		if(id<50)
		{
			System.out.println("Student ID No "+id+"  Is Valid");
		}
		else
		{
			throw new StudentnotFoundException(id);
		}
	}
	
	}





public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		try
		{
		Student s=new Student();
		s.CheckStudent(116);
		}
		catch (StudentnotFoundException e) {
			System.out.println("Inside catch "+e);
			
		}
		//System.out.println("End main....");

	}

}
