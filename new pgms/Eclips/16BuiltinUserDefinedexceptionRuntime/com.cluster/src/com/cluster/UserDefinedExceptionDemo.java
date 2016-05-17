package com.cluster;

class StudentNotFondException extends RuntimeException
{
	String msg;
	StudentNotFondException(int s)
	{
		msg="StudentId  "+s+"  IsNotValid";
	}
	
	public String toString()
	{
		return msg;
	}
	
	}

class Student
{
	void CheckStudentId(int id) throws StudentNotFondException
	{
		if(id<50)
		{
			System.out.println("StudentId  "+id+"  Is Valid");
		}
		else
		{
			throw new StudentNotFondException(id);
		}
	}
	}




public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		try{
		Student s = new Student();
		s.CheckStudentId(115);
		}
		catch(StudentNotFondException e)
		{
			System.out.println("Inside catch "+e);
		}
		System.out.println("End main....");
		

	}

}
