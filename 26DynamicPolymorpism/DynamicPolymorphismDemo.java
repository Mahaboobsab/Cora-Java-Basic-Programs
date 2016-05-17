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
class DynamicPolymorphismDemo
{
	public static void main(String args[])
	{
		A a=new A();
		System.out.println("VAlue of A is"+a);
		a.m1();
		a.fun();
		B b=new B();
		System.out.println("VAlue of B is"+b);
		b.m1();
		b.fun();


		}
	}
