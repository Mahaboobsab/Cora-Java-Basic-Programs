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
		
		
class C extends A
{
	void m3()
	{
	System.out.println("Inside method of C m3");
		}
	void fun()
	{
		System.out.println("Inside method of C fun");
		}
	}
	
	
	
	
class DynamicPolymorphismDemo5
{
	public static void main(String args[])
	{
		A a=new C();
		System.out.println("VAlue of A is"+a);
		a.m1();
		a.fun();
		}
	}
