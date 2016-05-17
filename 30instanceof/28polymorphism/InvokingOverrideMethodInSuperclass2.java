class A
{
	void m1()
	{
		System.out.println("Inside A m1 method");
		fun();
		}
		void fun()
	{
		System.out.println("Inside fun A method");
	}
		}
class B extends A
{
	void m2()
	{
		System.out.println("Inside B m2 method");

		}
		
		void fun()
		{
		System.out.println("Inside fun B method");
		
		}
	
}



class InvokingOverrideMethodInSuperclass2
{
	public static void main(String args[])
	{
		B b=new B();
		b.m1();
		
		}
	}
