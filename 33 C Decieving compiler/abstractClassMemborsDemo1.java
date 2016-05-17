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

class abstractClassMemborsDemo1
{
	public static void main(String args[])
	{
	B b = new B();
	b.m1();
	b.m2();
	
			}
	}
