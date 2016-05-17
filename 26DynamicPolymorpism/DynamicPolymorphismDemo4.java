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
	/*void meheboob()
	{
		System.out.println("Inside mmeheboob method of A");
		}*/
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
	void meheboob()
	{
		System.out.println("Inside mmeheboob method of B");
		}
	}
class DynamicPolymorphismDemo4
{
	public static void main(String args[])
	{
		A a=new B();
		System.out.println("VAlue of A is"+a);
		a.m1();
		a.fun();
		b=a;
	    System.out.println("value of a is"+a);

		}
	}
