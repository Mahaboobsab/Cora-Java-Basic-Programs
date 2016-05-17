abstract class A
{
	void m1()//concrete method
	{
		System.out.println("Inside A m1");
		}

void m2()//concrete method
	{
		System.out.println("Inside A m2");
		}
		
abstract void m3();
}

class B extends A
{
	void m3()//manddatary to override
	{
		System.out.println("Inside B m3");

		}
	void m1()
	{
		System.out.println("Inside B m1");
		}
	void m4()
	{
		System.out.println("Inside B m4");
		}
	}

class AbstractClassDemo3
{
	public static void main(String args[])
	{
		A a=null;
		B b=null;
		b=new B();
		b.m1();
		a=b;
		a.m1();
		a.m2();
		a.m3();
		}
	}
