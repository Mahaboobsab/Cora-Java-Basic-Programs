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

class AbstractClassDemo4
{
	public static void main(String args[])
	{

		B b=null;
		A a=new B();
		a.m1();
		a.m2();
		a.m3();
		}
	}
