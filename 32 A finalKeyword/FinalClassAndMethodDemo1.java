final class A
{
	
		void m1()
		{
	System.out.println("Inside A m1");
	}

	
	void m2()
	{
	System.out.println("Inside A m2");
	}

}
class B extends A//cannot inherit from A because it is final
{

		void m1()
	{
	System.out.println("Inside B m1");
	}
}
class FinalClassAndMethodDemo1
{
	public static void main(String args[])
	{
		System.out.println("Hello Meheoboob");
		
		}
	}
