class  A
{
	void m1()
	{
		System.out.println("Inside method of A m1");
		}
	void fun()
	{
		System.out.println("Inside method of A fun");
		}
	}
class B extends A
{
	void m2()
	{
		System.out.println("Inside m2 method of B");
		}
	void fun()
	{
		System.out.println("Inside method of B fun");
		}
	}
class DynamicPolymorphismDemo1
{
	public static void main(String args[])
	{
		A a=new B();
		System.out.println("VAlue of A is"+a);
		a.m1();
		a.fun();
		//a.m2();   // Error not present in A class
		//b.fun();


		}
	}
