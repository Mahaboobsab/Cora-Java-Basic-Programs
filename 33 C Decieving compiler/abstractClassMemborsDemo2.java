abstract class  A

{
	
void  m1()
{
	System.out.println("Inside A m1");
	}
	
void  m2()
{
	System.out.println("Inside A m2");
	}
}

class B extends A
{
	void m1()
	{
		super.m1();
		}
	
void m2()
	{
		super.m2();
	}
}

class abstractClassMemborsDemo2
{
	public static void main(String args[])
	{
	A a = new B();
	a.m1();
	a.m2();
	
			}
	}
